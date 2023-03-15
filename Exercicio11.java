import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

    public class Exercicio11
    {
        public static void main(String[]args)
        {
            double diametro;
            DecimalFormat formatador = new DecimalFormat("0.00");
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite o valor do diâmetro: ");
            diametro = ler.nextDouble();
            System.out.print("A área do seu círculo é de: " + formatador.format((diametro/2)*(diametro/2)*Math.PI));
        }
    }