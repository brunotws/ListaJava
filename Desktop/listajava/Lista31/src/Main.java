import java.util.Scanner;
import java.util.Arrays;

public class OrdenaTresValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Digite o segundo número (diferente do primeiro): ");
        numeros[1] = scanner.nextInt();

        System.out.print("Digite o terceiro número (diferente dos anteriores): ");
        numeros[2] = scanner.nextInt();

        // Verifica se são distintos
        if (numeros[0] == numeros[1] || numeros[0] == numeros[2] || numeros[1] == numeros[2]) {
            System.out.println("Erro: Os números devem ser distintos.");
        } else {
            // Ordena os números
            Arrays.sort(numeros);
            System.out.println("Números em ordem crescente: " +
                    numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        }

        scanner.close();
    }
}
