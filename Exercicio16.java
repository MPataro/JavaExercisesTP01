import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio16 {
    public static void main(String[] args) 
    {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Insira um ângulo em graus: ");
                double graus = input.nextDouble();
    
                double radiano = Math.toRadians(graus);
                double seno = Math.sin(radiano);
                double coseno = Math.cos(radiano);
                double tangente = Math.tan(radiano);
                double secante = 1 / Math.cos(radiano);
    
                System.out.printf("Seno: %.2f\n", seno);
                System.out.printf("Coseno: %.2f\n", coseno);
                System.out.printf("Tangente: %.2f\n", tangente);
                System.out.printf("Secante: %.2f\n", secante);
    }
}
}
