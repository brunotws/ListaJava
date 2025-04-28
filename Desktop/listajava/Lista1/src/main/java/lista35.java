import java.util.Scanner;

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
                    continue; // volta ao início do loop
            }

            double valorFinal = valorVeiculo -
