public class FaturamentoMensalDistribuidora {

    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        displayPercentages(sp, rj, mg, es, outros);
    }

    public static double calculateTotal(double... values) {
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total;
    }

    public static double calculatePercentage(double value, double total) {
        return (value / total) * 100;
    }

    public static void displayPercentages(double sp, double rj, double mg, double es, double outros) {
        double total = calculateTotal(sp, rj, mg, es, outros);

        System.out.printf("Percentual de SP: %.2f%%\n", calculatePercentage(sp, total));
        System.out.printf("Percentual de RJ: %.2f%%\n", calculatePercentage(rj, total));
        System.out.printf("Percentual de MG: %.2f%%\n", calculatePercentage(mg, total));
        System.out.printf("Percentual de ES: %.2f%%\n", calculatePercentage(es, total));
        System.out.printf("Percentual de Outros: %.2f%%\n", calculatePercentage(outros, total));
    }
}
