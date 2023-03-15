import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Insira o raio da esfera: ");
            double r = input.nextDouble();
            System.out.print("Insira a aresta do cubo: ");
            double a = input.nextDouble();

            double volumeLivre = Math.pow(a, 3) - (4 / 3 * Math.PI * Math.pow(r, 3));

            System.out.printf("O volume livre é %.2f cubos quadrados.\n", volumeLivre);
        }
    }
}