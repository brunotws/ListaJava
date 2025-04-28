import java.util.Scanner;

public class ClassificacaoEstudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados do estudante
        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de matrícula do estudante: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final (0 a 10): ");
        double notaFinal = scanner.nextDouble();

        // Cálculo da média ponderada
        double mediaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaFinal * 5) / (2 + 3 + 5);

        // Classificação
        String classificacao;

        if (mediaFinal >= 8 && mediaFinal <= 10) {
            classificacao = "A";
        } else if (mediaFinal >= 7 && mediaFinal < 8) {
            classificacao = "B";
        }
