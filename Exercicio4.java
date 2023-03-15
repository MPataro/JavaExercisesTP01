// Vinnicius e Miguel Pataro
import java.util.Scanner;
import java.lang.Math;
    public class Exercicio4
    {
        public static void main(String[] args)
        {
            double area, base, alt;
            System.out.println("Digite o valor da base do triângulo: ");
            Scanner ler = new Scanner(System.in);
            base = ler.nextDouble();
            System.out.println("Digite o valor da altura do triângulo: ");
            alt = ler.nextDouble();
            area = (base*alt )/2;
            System.out.println("O valor da área é: "+area);
            
        }
    }
    