package mydocument.lista9;
import java.util.Scanner;
public class Lista9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor depositado: ");
        double valorDepositado = scanner.nextDouble();

        double rendimento = valorDepositado * 0.007; 
        double valorTotal = valorDepositado + rendimento;

        System.out.printf("Valor após um mês com rendimento: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
