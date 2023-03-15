import java.util.Scanner;
import java.text.DecimalFormat;

    public class Exercicio15
    {
        public static void main(String[]args)
        {
            double cotacao, valor;
            DecimalFormat formatador = new DecimalFormat("0.00");
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite o valor da cotação atual: ");
            cotacao = ler.nextDouble();
            System.out.print("Digite o valor a em dólar: ");
            valor = ler.nextDouble();
            System.out.print("Você tem: R$ " + formatador.format(valor/cotacao));
        }
    }