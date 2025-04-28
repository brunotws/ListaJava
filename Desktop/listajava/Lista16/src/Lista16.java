public class Lista16 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media <= 5.0) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }

        scanner.close();
    }
}
