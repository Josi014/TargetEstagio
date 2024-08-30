import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numberInfo = sc.nextInt();

        if (fibonacciNumber(numberInfo)) {
            System.out.println("O número " + numberInfo + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numberInfo + " não pertence à sequência de Fibonacci.");
        }

    }

    public static boolean fibonacciNumber(int n) {
        int number1 = 0, number2 = 1;
        while (number2 < n) {
            int nextTerm = number1 + number2;
            number1 = number2;
            number2 = nextTerm;
        }
        return number2 == n;
    }

}
