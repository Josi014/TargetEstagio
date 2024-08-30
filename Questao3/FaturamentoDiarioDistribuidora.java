package Questao3;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FaturamentoDiarioDistribuidora {
    public static void main(String[] args) {
        String caminhoArquivo = "faturamento.xml";
        List<Double> values = new ArrayList<>();

        try {
            File inputFile = new File(caminhoArquivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("dia");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    double value = Double.parseDouble(eElement.getElementsByTagName("valor").item(0).getTextContent());
                    if (value > 0) { 
                        values.add(value);
                    }
                }
            }

            double lowestValue = Collections.min(values);
            double highestValue = Collections.max(values);

            double soma = 0;
            for (double valor : values) {
                soma += valor;
            }
            double mediaMensal = soma / values.size();

            long daysAboveAverage = 0;
            for (double valor : values) {
                if (valor > mediaMensal) {
                    daysAboveAverage++;
                }
            }

            System.out.println("Menor valor de faturamento: " + lowestValue);
            System.out.println("Maior valor de faturamento: " + highestValue);
            System.out.println("Número de dias com faturamento acima da média: " + daysAboveAverage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
