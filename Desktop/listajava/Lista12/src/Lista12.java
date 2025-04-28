public class Lista12 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        double impostos = custoFabrica * 0.45;
        double custoComImpostos = custoFabrica + impostos;
        double percentualDistribuidor = custoComImpostos * 0.28;
        double custoConsumidor = custoComImpostos + percentualDistribuidor;

        System.out.println("O custo ao consumidor é: R$ " + String.format("%.2f", custoConsumidor));

        scanner.close();
    }
}
