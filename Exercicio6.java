import java.util.Scanner;
import java.lang.Math;

    public class Exercicio6
    {
        public static void main(String [] args)
        {

        double v[] = new double[4];
        int i;
        double media;
            for(i = 0; i < 4; i++)
            {
            Scanner ler = new Scanner(System.in);
            System.out.println("digite o "+i+ " valor:" );
            v[i] = ler.nextDouble();
        
            }
        media = (v[0] + v[1] + v[2] + v[3] ) / 4;
        System.out.println("O valor da média aritmética é: " + media);
        }
        
    }
