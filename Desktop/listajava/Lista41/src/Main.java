import java.util.Scanner;

public class Main {

    public static boolean Exercicio41(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\nEXERCÍCIO 41 -- UM PERFECT NUMBER BB\n");
            System.out.print("DIGITE UM NÚMERO: ");
            int numero = input.nextInt();

            if (Exercicio41(numero)) {
                System.out.println(numero + " É UM NÚMERO PERFEITO.");
            } else {
                System.out.println(numero + " NÃO É UM NÚMERO PERFEITO.");
            }
        }
    }
}
