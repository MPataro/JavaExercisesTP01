import java.util.Scanner;
import java.lang.Math;

    public class Exercicio8 {
        public static void main(String[]args)
        {
            double metros, milha, km;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor em milhas maritimas:");
            milha = ler.nextDouble();
            km = milha * 1.852;
            System.out.println("Valor em KM: "+km);


        }

    }