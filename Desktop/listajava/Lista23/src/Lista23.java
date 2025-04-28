public class Lista23 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 80) {
            System.out.println("O número é maior que 80.");
        } else if (numero < 25) {
            System.out.println("O número é menor que 25.");
        } else if (numero == 40) {
            System.out.println("O número é igual a 40.");
        } else {
            System.out.println("O número não atende nenhuma das condições especiais.");
        }

        scanner.close();
    }
}
