package mydocument.lista1;
import java.util.Scanner;
public class Lista1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.println("Escreva o primeiro número: ");
       int num1 = scanner.nextInt();
       System.out.println("Escreva o segundo número: ");
       int num2 = scanner.nextInt();
           int sum = num1 + num2;
       System.out.println("A soma é: " + sum);
       scanner.close();
    }
}
