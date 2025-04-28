import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EXERCÍCIO 39 -- CLASSIFICAÇÃO DE ESTUDANTE");

        while (true) {

            System.out.println("VAMOS CALCULAR A NOTA FINAL E A CLASSIFICAÇÃO DE UM ESTUDANTE");

            System.out.print("NOME: ");
            String nome = input.nextLine().toUpperCase();
            System.out.print("MATRÍCULA: ");
            String matricula = input.nextLine().toUpperCase();

            System.out.print("NOTA 1: (0 A 10) ");
            double nota1 = input.nextDouble();
            System.out.print("NOTA 2: (0 A 10) ");
            double nota2 = input.nextDouble();
            System.out.print("NOTA 3: (0 A 10) ");
            double nota3 = input.nextDouble();

            double notaFinal = (nota1 + nota2 + nota3) / 3;

            String classificacao = (notaFinal >= 8) ? "A" :
                    (notaFinal >= 7) ? "B" :
                            (notaFinal >= 6) ? "C" :
                                    (notaFinal >= 5) ? "D" : "R";

            System.out.println("\nNOME: " + nome);
            System.out.println("MATRÍCULA: " + matricula);
            System.out.println("NOTA FINAL: " + notaFinal);
            System.out.println("CLASSIFICAÇÃO: " + classificacao);

            System.out.print("DESEJA CALCULAR OUTRA NOTA? (S/N): ");
            input.nextLine();
            String resposta = input.nextLine().toUpperCase();

            if (resposta.equals("N")) {
                break;
            }

        }
    }
}
