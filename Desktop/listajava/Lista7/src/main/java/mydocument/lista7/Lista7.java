package mydocument.lista7;
import java.util.Scanner;
public class Lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão
        double fahrenheit = (9 * celsius + 160) / 5;

        // Saída de dados
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", fahrenheit);

        scanner.close();
    }
}
