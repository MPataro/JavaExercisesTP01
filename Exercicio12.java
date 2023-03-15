import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

    public class Exercicio12
    {
        public static void main(String[]args)
        {
            double raio, altura;
            DecimalFormat formatador = new DecimalFormat("0.00");
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite o valor do raio da base: ");
            raio = ler.nextDouble();
            System.out.print("Digite o valor da altura: ");
            altura = ler.nextDouble();
            System.out.print("A área do seu círculo é de: " + formatador.format((raio*raio*Math.PI)*altura/3));
        }
    }