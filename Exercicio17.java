import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Insira o valor X: ");
            double x = input.nextDouble();
            System.out.print("Insira o valor Y: ");
            double y = input.nextDouble();

            double result = Math.exp(y * Math.log(x));

            System.out.printf("%.2f elevado a %.2f é %.2f\n", x, y, result);
        }
    }
}