import java.util.Scanner;

public class Main {
    public static double calcularPotencia(double X, int Z) {
        return Math.pow(X, Z);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("EXERCÍCIO 45 -- X ELEVADO A Z");

        while (true){
            double X;
            int Z;

            System.out.println("O PROGRAMA RECEBE DOIS VALOR (X E Z) E CALCULA O VALOR DE X ELEVADO A Z: ");

            System.out.println("INFORME O VALOR DE X");
            X = input.nextInt();
            System.out.println("INFORME O VALOR DE Z");
            Z = input.nextInt();

            double resultado = calcularPotencia(X, Z);
            System.out.println(X + " elevado a " + Z + " é: " + resultado);
        }
    }
}
