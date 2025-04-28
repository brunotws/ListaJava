public class Lista14 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (diferente do primeiro): ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais. Por favor, insira números distintos.");
        }

        scanner.close();
    }
}
