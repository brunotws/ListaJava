package mydocument.lista2;
import java.util.Scanner;
public class Lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();
       
        double sum = num1 + num2;
        double product = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("A soma dos numeros é: " + sum);
        System.out.println("O resultado da multiplicação dos numeros é: " + product);
        System.out.println("O resultado da divisão dos numeros é: " + division);
        
        scanner.close();
        
       }
} 

