public class Lista21 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int totalPessoas = 0;
        int totalAptos = 0;
        int totalInaptos = 0;
        String continuar;

        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Está com boa saúde? (S para sim / N para não): ");
            String saude = scanner.nextLine().toUpperCase();

            boolean apto = (sexo.equals("M") && idade >= 18 && saude.equals("S"));

            System.out.println(nome + " está " + (apto ? "APTO" : "INAPTO") + " para o serviço militar.");

            if (apto) {
                totalAptos++;
            } else {
                totalInaptos++;
            }

            totalPessoas++;

            System.out.print("\nDeseja cadastrar outra pessoa? (S/N): ");
            continuar = scanner.nextLine().toUpperCase();

        } while (!continuar.equals("N"));

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de aptos: " + totalAptos);
        System.out.println("Total de inaptos: " + totalInaptos);

        scanner.close();
    }
}
