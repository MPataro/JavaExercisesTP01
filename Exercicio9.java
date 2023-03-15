// Vinnicius Oliveira Rodrigues e Miguel Pataro
import java.util.Scanner;
import java.lang.Math;

    public class Exercicio9
    {
        public static void main(String[]args)
        {
            double tensao, corrente, resistencia;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor da corrente elétrica:");
            corrente = ler.nextDouble();
            System.out.println("Digite o valor da resistência:");
            resistencia = ler.nextDouble();
            tensao = resistencia*corrente;
            System.out.println("Valor em KM: "+tensao);

        }
    }
