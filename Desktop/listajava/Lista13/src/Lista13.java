public class Lista13 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O número é maior que 10!");
        }

        scanner.close();
    }
}
