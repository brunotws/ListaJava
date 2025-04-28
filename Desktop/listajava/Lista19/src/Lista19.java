public class Lista19 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M para masculino / F para feminino): ");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                System.out.println(nome + " é Homem.");
                totalHomens++;
            } else if (sexo.equals("F")) {
                System.out.println(nome + " é Mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido informado para " + nome + ". Será ignorado no contador.");
            }
        }

        System.out.println("\nTotal de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        scanner.close();
    }
}
