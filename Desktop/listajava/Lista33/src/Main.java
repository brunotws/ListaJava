import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos lados
        System.out.print("Digite o lado A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o lado B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o lado C: ");
        int C = scanner.nextInt();

        // Verificação da possibilidade de formar um triângulo
        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("É um triângulo válido.");

            if (A == B && B == C) {
                System.out.println("Tipo: Triângulo Equilátero.");
            } else if (A == B || B == C || A == C) {
                System.out.println("Tipo: Triângulo Isósceles.");
            } else {
                System.out.println("Tipo: Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }

        scanner.close();
    }
}
