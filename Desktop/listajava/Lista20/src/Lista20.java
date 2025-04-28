public class Lista20 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        String continuar;

        do {
            System.out.print("Digite o ano do veículo: ");
            int ano = scanner.nextInt();

            System.out.print("Digite o valor do veículo: R$ ");
            double valor = scanner.nextDouble();

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valor * 0.07;
            }

            double valorFinal = valor - desconto;

            System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
            System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valorFinal));

            totalGeral++;

            System.out.print("\nDeseja continuar calculando desconto? (S/N): ");
            scanner.nextLine(); // Consumir a quebra de linha pendente
            continuar = scanner.nextLine().toUpperCase();

        } while (!continuar.equals("N"));

        System.out.println("\nTotal de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
