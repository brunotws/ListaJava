public class Lista17 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 80; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador);

        scanner.close();
    }
}
