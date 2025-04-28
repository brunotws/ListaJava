package mydocument.lista8;
import java.util.Scanner;
public class Lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double dolares = scanner.nextDouble();

        double reais = cotacao * dolares;

        System.out.printf("Valor em reais: R$ %.2f%n", reais);

        scanner.close();
    }
}
