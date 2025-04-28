public class Lista11 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$ ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();

        double valorVenda = precoCusto + (precoCusto * percentualAcrescimo / 100);

        System.out.println("O valor de venda do produto é: R$ " + String.format("%.2f", valorVenda));

        scanner.close();
    }
}
