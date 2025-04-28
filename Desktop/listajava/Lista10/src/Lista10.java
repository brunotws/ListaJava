public class Lista10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada prestação é: R$ " + String.format("%.2f", valorPrestacao));

        scanner.close();
    }
}
