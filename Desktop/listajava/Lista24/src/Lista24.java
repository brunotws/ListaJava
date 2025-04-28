public class Lista24 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("O número é Positivo.\n");
            } else if (numero < 0) {
                System.out.println("O número é Negativo.\n");
            } else {
                System.out.println("O número é Zero.\n");
            }
        }

        scanner.close();
    }
}
