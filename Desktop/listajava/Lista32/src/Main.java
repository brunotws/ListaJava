import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return;
                }
                resultado = A / B;
                break;
            default:
                System.out.println("Erro: Operador não definido.");
                operacaoValida = false;
                resultado = 0;
        }

        if (operacaoValida) {
            System.out.printf("Resultado da operação %.2f %c %.2f = %.2f%n", A, operador, B, resultado);
        }

        scanner.close();
    }
}
