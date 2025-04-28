import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade;
        System.out.println("EXECICIO 35 -- FAIXA ÉTARIA NARRADOR");

        do {
            System.out.println("INFORME A IDADE DO NARRADOR");
            idade = input.nextInt();

            if (idade >= 5 && idade <= 7) {
                System.out.println("Infantil A");
            } else if (idade >= 8 && idade <= 10){
                System.out.println("Infantil B");
            } else if (idade >= 11 && idade <= 13){
                System.out.println("juvenil A");
            }else if (idade >= 14 && idade <= 17){
                System.out.println("juvenil B");
            }else if (idade >= 18 && idade <= 25){
                System.out.println("Sênior");
            }else {
                System.out.println("idade fora da faixa etária");
            }

        }while (idade >=0);
    }
}