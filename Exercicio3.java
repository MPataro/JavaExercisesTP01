// Vinnicius e Miguel Pataro
    import java.util.Scanner;
    import java.lang.Math;
        public class Exercicio3{
            public static void main(String[] args){
                double diagonal, area, lado, raiz;
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o valor da diagonal do quadrado:");
                diagonal = ler.nextDouble();
                raiz = Math.sqrt(2);
                lado = diagonal / raiz;
                area = Math.pow(lado, 2);
                System.out.println("O valor da àrea é "+area);
            }
        }