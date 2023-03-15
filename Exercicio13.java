import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

    public class Exercicio13
    {
        public static void main(String[]args)
        {
            double velocidadeInicial, tempo, aceleração;
            DecimalFormat formatador = new DecimalFormat("0.00");
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite o valor da velocidade inicial em m/s: ");
            velocidadeInicial = ler.nextDouble();
            System.out.print("Digite o valor da aceleração m/s²: ");
            aceleração = ler.nextDouble();
            System.out.print("Digite o valor do tempo percorrido em segundos: ");
            tempo = ler.nextDouble();
            System.out.print("A velocidade final é de: " + formatador.format((velocidadeInicial+(aceleração*tempo))*3.6) + "km/h");
        }
    }