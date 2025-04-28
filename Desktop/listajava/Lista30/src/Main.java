import java.util.Scanner;

public class SalarioLiquidoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        // Cálculo do abono
        double abono = 0;

        if (sexo == 'M') {
            abono = (idade >= 30) ? 100 : 50;
        } else if (sexo == 'F') {
            abono = (idade >= 30) ? 200 : 800;
        } else {
            System.out.println("Sexo inválido.");
            scanner.close();
            return;
        }

        double salarioLiquido = salarioFixo + abono;

        // Saída
        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
