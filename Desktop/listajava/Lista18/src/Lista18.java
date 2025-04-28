public class Lista18 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }

        scanner.close();
    }
}
