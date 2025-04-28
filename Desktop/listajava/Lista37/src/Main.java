import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar;
        System.out.println("EXERCICIO 37 -- CALCULO DE IMC");

        do {
            System.out.print("Digite o nome: ");
            String nome = input.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = input.next().toUpperCase();

            System.out.print("Digite a altura (em metros): ");
            double altura = input.nextDouble();

            System.out.print("Digite a idade: ");
            int idade = input.nextInt();

            double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);

            if (pesoIdeal != -1) {
                System.out.printf("%s, seu peso ideal é: %.2f kg%n", nome, pesoIdeal);
            } else {
                System.out.println("Sexo inválido. Informe 'M' para masculino ou 'F' para feminino.");
            }

            input.nextLine();

            System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            continuar = input.nextLine().toUpperCase();

        } while (continuar.equals("S"));
    }

    public static double calcularPesoIdeal(String sexo, double altura, int idade) {
        if (sexo.equals("M")) {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    return (72.7 * altura) - 53;
                } else {
                    return (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    return (72.7 * altura) - 50;
                } else {
                    return (72.7 * altura) - 58;
                }
            }
        } else if (sexo.equals("F")) {
            if (altura > 1.50) {
                if (idade >= 35) {
                    return (62.1 * altura) - 45;
                } else {
                    return (62.1 * altura) - 49;
                }
            } else {
                return (62.1 * altura) - 44.7;
            }
        } else {
            return -1;
        }
    }
}
