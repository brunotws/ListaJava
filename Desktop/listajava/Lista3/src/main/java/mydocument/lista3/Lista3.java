package mydocument.lista3;
import java.util.Scanner;
public class Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira quantos quilômetros foram percorridos: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Insira a quantidade de combustível gasta em litros: ");
        double num2 = scanner.nextDouble();
        
        double rendimento = num1 / num2;
                System.out.printf("O consumo médio de combustível é de: %.2f km por litro\n", rendimento);
                scanner.close();
        
    }
}
