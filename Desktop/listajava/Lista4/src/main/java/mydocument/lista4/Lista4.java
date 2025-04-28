package mydocument.lista4;
import java.util.Scanner;
public class Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do vendedor: ");
        String Nome = scanner.nextLine();
        System.out.print("Informe o salário fixo do vendedor: ");
        Double SF = scanner.nextDouble();
        System.out.print("Informe o valor total das vendas efetuadas pelo vendedor no mês: ");
        Double VE = scanner.nextDouble();
        
        Double rendimento = VE * 0.15;
        Double VF = SF + rendimento;
        
        System.out.println("O salário final do vendedor " + Nome + " é de: R$ " + VF);
        scanner.close();
       
    }
}
