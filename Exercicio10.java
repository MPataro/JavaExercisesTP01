// Vinnicius Oliveira Rodrigues e Miguel Pataro
import java.util.Scanner;
import java.lang.Math;

    public class Exercicio10
    {
        public static void main(String[]args)
        {
            double celsius, F, resistencia;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor da temperatura em graus Celsius:");
            celsius = ler.nextDouble();
            
            F = (celsius * (9/5)) + 32;
            System.out.println("Valor em Fahreint: "+F);

        }
    }