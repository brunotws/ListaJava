public class Lista22 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.print("Digite o preço de custo do " + i + "º produto: R$ ");
            double precoCusto = scanner.nextDouble();

            System.out.print("Digite o preço de venda do " + i + "º produto: R$ ");
            double precoVenda = scanner.nextDouble();

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Resultado: Lucro\n");
            } else if (precoVenda < precoCusto) {
                System.out.println("Resultado: Prejuízo\n");
            } else {
                System.out.println("Resultado: Empate\n");
            }
        }

        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;

        System.out.println("--- Resultado Final ---");
        System.out.println("Média de preço de custo: R$ " + String.format("%.2f", mediaPrecoCusto));
        System.out.println("Média de preço de venda: R$ " + String.format("%.2f", mediaPrecoVenda));

        scanner.close();
    }
}
