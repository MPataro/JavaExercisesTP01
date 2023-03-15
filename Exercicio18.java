import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio18
{
    public static void main(String[] args) {
        double pagamento, valor1, valor2, valor3, valor4, valor5, total;
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os 5 valores: ");
        System.out.print("R$ ");
        valor1 = ler.nextDouble();
        System.out.print("R$ ");
        valor2 = ler.nextDouble();
        System.out.print("R$ ");
        valor3 = ler.nextDouble();
        System.out.print("R$ ");
        valor4 = ler.nextDouble();
        System.out.print("R$ ");
        valor5 = ler.nextDouble();
        System.out.print("Digite o valor pago: R$ ");

        total = valor1 + valor2 + valor3 + valor4 + valor5;
        pagamento = ler.nextDouble();
        if (pagamento > total) {
            System.out.print("Troco = R$ " + formatador.format(pagamento - total));
        } else if (pagamento < total) {
            System.out.print("Falta = R$ " + formatador.format(total - pagamento));
        } else {
            System.out.print("Está tudo certo!");
        }
    }
}