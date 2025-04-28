public class Lista15 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número NÃO está no intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}
