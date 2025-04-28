import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class CarangoVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorVeiculo;
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Digite o valor do veículo (0 para sair): R$ ");
            valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina, D - Diesel): ");
            char combustivel = scanner.next().toUpperCase().charAt(0);

            double desconto = 0;

            switch (combustivel) {
                case 'A':
                    desconto = valorVeiculo * 0.25;
                    break;
                case 'G':
                    desconto = valorVeiculo * 0.21;
                    break;
                case 'D':
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido. Tente novamente.");
                    continue;
            }

            double valorFinal = valorVeiculo - desconto;

            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

            totalDesconto += desconto;
            totalPago += valorFinal;
        }

        System.out.println("\nResumo da Concessionária CARANGO:");
        System.out.printf("Total de descontos concedidos: R$ %.2f%n", totalDesconto);
        System.out.printf("Total pago pelos clientes: R$ %.2f%n", totalPago);

        // Salvar o resumo em .dia
        try (FileWriter writer = new FileWriter(".dia/resumo.txt")) {
            writer.write(String.format("Total de descontos: R$ %.2f%n", totalDesconto));
            writer.write(String.format("Total pago: R$ %.2f%n", totalPago));
            System.out.println("Resumo salvo em .dia/resumo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o resumo: " + e.getMessage());
        }

        scanner.close();
    }
}
