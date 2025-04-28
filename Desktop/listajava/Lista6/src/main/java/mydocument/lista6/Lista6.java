package mydocument.lista6;
import java.util.Scanner;
public class Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Após a troca:");
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        scanner.close();
    }
}
