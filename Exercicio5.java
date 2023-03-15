// Vinnicius e Miguel Pataro
import java.util.Scanner;
import java.lang.Math;

    public class Exercicio5
    {
        public static void main(String [] args)
        {
            double volume, diametro, raio;
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o valor do diâmetro");
            diametro = ler.nextDouble();
            //Ve = 4.p.r²/3
            raio = diametro/2;
            volume = (4 * Math.PI * (Math.pow(raio,2))) / 3;
            System.out.println("O valor do volume é: " +volume);

        }
    }