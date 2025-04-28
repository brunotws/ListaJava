import java.util.Scanner;

public class Main {

    public static void calcularTaboada(int N, int T) {
        for (int i = 1; i <= T; i++) {
            int resultado = N * i;
            System.out.println(N + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EXERCÍCIO 43 -- TABUADA");

        while (true){

            int N;
            int T;

            System.out.println("INFORME UM VALOR:");
            N = input.nextInt();
            System.out.println("INFORME OUTRO VALOR:");
            T = input.nextInt();

            calcularTaboada(N, T);
        }
    }
}
