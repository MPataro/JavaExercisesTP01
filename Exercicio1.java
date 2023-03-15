// Vinnicius Oliveira Rodrigues e Miguel Pataro
import java.util.Scanner;
    public class Exercicio1{
        public static void main (String [] args){
        double base, altura, area;
        System.out.println("Digite o valor da base do retângulo:");
        Scanner scan = new Scanner(System.in);
        base = scan.nextDouble();
        System.out.println("Digite o vaor da altura do retângulo:");
        altura = scan.nextDouble();
        System.out.print("O valor da àrea:");
        area = base*altura;
        System.out.println(area);


    }



}