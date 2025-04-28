import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EXERCICIO 40 -- CATEGORIA DE SEGURO BASEADA NA IDADE E GRUPO DE RISCO");

        while (true) {
            System.out.print("DIGITE O NOME DO PRETENDENTE: ");
            String nome = input.nextLine();

            System.out.print("DIGITE A IDADE DO PRETENDENTE: ");
            int idade = input.nextInt();

            if (idade < 17 || idade > 70) {
                System.out.println("IDADE FORA DA FAIXA PERMITIDA.");
                input.nextLine();
                continue;
            }

            System.out.print("DIGITE O GRUPO DE RISCO (1 - BAIXO, 2 - MÉDIO, 3 - ALTO): ");
            int grupoRisco = input.nextInt();
            input.nextLine();

            int categoria = calcularCategoria(idade, grupoRisco);

            System.out.println("NOME: " + nome);
            System.out.println("IDADE: " + idade);
            System.out.println("CATEGORIA DO SEGURO: " + categoria);

            System.out.print("DESEJA CONTINUAR? (s/n): ");
            String resposta = input.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("PROGRAMA FINALIZADO.");
    }
    public static int calcularCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco == 1 ? 1 : grupoRisco == 2 ? 2 : 3;
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco == 1 ? 2 : grupoRisco == 2 ? 3 : 4;
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco == 1 ? 3 : grupoRisco == 2 ? 4 : 5;
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco == 1 ? 4 : grupoRisco == 2 ? 5 : 6;
        } else if (idade >= 65 && idade <= 70) {
            return grupoRisco == 1 ? 7 : grupoRisco == 2 ? 8 : 9;
        }
        return -1;
    }
}
