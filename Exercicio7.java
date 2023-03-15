// importando bibliotecas
import java.util.Scanner;
import java.lang.Math;

    public class Exercicio7
    {
        public static void main(String[] args)
    {
        double v1, v2, mediag, raiz;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        v1 = ler.nextDouble();
        System.out.println("Digite o segundo valor:");
        v2 = ler.nextDouble();
        raiz = v1*v2;
        mediag = Math.sqrt(raiz);
        
        System.out.println("O valor da média geométrica: " +mediag);
        
    }
    }