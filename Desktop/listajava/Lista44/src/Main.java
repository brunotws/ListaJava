import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EXERCICIO 44 -- FATORIAL");


        System.out.print("DIGITE UM VALOR INTEIRO E POSITIVO PARA N:");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("VALOR INVÁLIDO. DIGITE UM NÚMERO INTEIRO E POSITIVO.");
        } else {
            double S = calcularS(N);
            System.out.println("O VALOR DE S PARA N = " + N + " é: " + S);
        }

        scanner.close();
    }

    public static double calcularS(int N) {
        double S = 0;
        int fatorial = 1;

        for (int i = 0; i <= N; i++) {
            if (i > 0) {
                fatorial *= i;
            }
            S += 1.0 / fatorial;
        }

        return S;
    }
}
