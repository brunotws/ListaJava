public class Lista25 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais: " + numero1 + " e " + numero2);
        } else {
            if (numero1 > numero2) {
                System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo (" + numero2 + ").");
            } else {
                System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro (" + numero1 + ").");
            }
            System.out.println("Os números são diferentes.");
        }

        scanner.close();
    }
}
