import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opt = -1;
        double KW, soma;

        System.out.println("EXERCICIO 36 -- CALCULO CONTA DE LUZ");

        do {
            System.out.println("--- MENU DE OPÇÕES ---");
            System.out.println("\tSELECIONE UMA OPÇÃO -- TIPO DE CLIENTE");
            System.out.println("\tDIGITE 1 -- RESIDÊNCIA -- ");
            System.out.println("\tDIGITE 2 -- COMÉRCIO -- ");
            System.out.println("\tDIGITE 3 -- INDÚSTRIA -- ");
            System.out.println("\tDIGITE 0 -- SAIR -- ");

            if (input.hasNextInt()) {
                opt = input.nextInt();
            } else {
                input.next();
                System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
                continue;
            }

            switch (opt){
                case 1:
                    System.out.println("DIGITE O QUANTOS kW/h ESTA PESSOA GASTA");
                    System.out.println("UMA PESSOA GASTA EM MÉDIA 150 a 250 kWh/mês");
                    System.out.println("O kW ESTA NO VALOR DE 0,60");
                    KW = input.nextDouble();
                    soma = (KW * 0.60);

                    System.out.println("A CONTA DE LUZ ESTA NO VALOR DE R$ " + soma);
                    break;
                case 2:
                    System.out.println("DIGITE O QUANTOS kW/h O COMÉRCIO GASTA");
                    System.out.println("UM COMÉRCIO PEQUENO/MÉDIO GASTA 2.000 a 5.000 kWh/mês");
                    System.out.println("O kW ESTÁ NO VALOR DE 0,48");
                    KW = input.nextDouble();
                    soma = (KW * 0.48);

                    System.out.println("A CONTA DE LUZ ESTA NO VALOR DE R$ " + soma);
                    break;
                case 3:
                    System.out.println("DIGITE O QUANTOS kW/h A INDÚSTRIA GASTA");
                    System.out.println("UMA INDÚSTRIA PEQUENA GASTA EM MÉDIA 10.000 a 50.000 kWh/mês");
                    System.out.println("O kW ESTÁ 1,29");
                    KW = input.nextDouble();
                    soma = (KW * 1.29);

                    System.out.println("A CONTA DE LUZ ESTA NO VALOR DE R$ " + soma );
                    break;
                case 0:
                    System.out.println("FINALIZANDO PROGRAMA......");
                default:
                    System.out.println("DIGITE UM VALOR VALIDO....");
            }
        }while ( opt !=0);
    }
}