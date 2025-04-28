import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EXERCÍCIO 42 -- VALORES ORDENADOS");

        int a, b, c;
        System.out.println("INFORME O VALOR DE A");
        a = input.nextInt();
        System.out.println("INFORME O VALOR DE B");
        b = input.nextInt();
        System.out.println("INFORME O VALOR DE C");
        c = input.nextInt();
        int[] resultado = ordenarValores(a, b, c);

        System.out.println("VALORES ORDENADOS: ");
        for (int valor : resultado) {
            System.out.println(valor);
        }
    }

    public static int[] ordenarValores(int a, int b, int c) {
        int[] valores = {a, b, c};

        java.util.Arrays.sort(valores);
        return valores;
    }
}
