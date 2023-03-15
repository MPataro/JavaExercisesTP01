// Vinnicius Oliveira Rodrigues e Miguel Pataro
    import java.util.Scanner;
    import java.lang.Math;
        public class Exercicio2{
            public static void main(String[] args)
            {
                double aresta, area;
                System.out.println("Digite o valor da aresta:");
                Scanner scan = new Scanner(System.in);
                aresta = scan.nextDouble();
                System.out.println("O valor da área é: " + Math.pow(aresta, 2));
            }
        }