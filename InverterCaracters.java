import java.util.Scanner;

public class InverterCaracters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String input = sc.nextLine();

        char[] caracteres = input.toCharArray();
        int start = 0;
        int end = caracteres.length - 1;

        while (start < end) {
            char aux = caracteres[start];
            caracteres[start] = caracteres[end];
            caracteres[end] = aux;

            start++;
            end--;
        }
       
        System.out.println("Palavra invertida: " );
        for(int i=0; i<input.length(); i++){
            System.out.print(caracteres[i]);
        }
    
    }

}
