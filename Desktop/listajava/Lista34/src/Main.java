import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opt,aula;
        double hora,salario1,salario2,salario3;
        char AouH;

        System.out.println("Exercicio 34 -- CALCULO DE SALÁRIO DE PROFESSORES");
        System.out.println("BEM VINDO AO SISTEMA DE CALCULO DA ESCOLA ESTADUAL APRENDER");

        do{
            System.out.println("--- MENU DE OPÇÕES ---");
            System.out.println("\tSELECIONE UMA OPÇÃO QUE O PROFESSOR SE ENQUADRA");
            System.out.println("\tDIGITE 1 -- PROFESSOR NÍVEL 1 -- ");
            System.out.println("\tDIGITE 2 -- PROFESSOR NÍVEL 2 -- ");
            System.out.println("\tDIGITE 3 -- PROFESSOR NÍVEL 3 -- ");
            System.out.println("\tDIGITE -1 -- SAIR -- ");
            opt = input.nextInt();

            switch (opt){

                case -1:
                    System.out.println(" -- FINALIZANDO PROGRAMA.... --");
                    return;
                case 1:
                    System.out.println("\nPROFESSORES NÍVEL 1 RECEBEM R$12,00 POR HORA/AULA");

                    System.out.println("GOSTARIA DE CALCULAR O SALÁRIO POR HORA OU POR AULA?");
                    System.out.println("DIGITE (H) PARA HORAS E (A) PARA AULAS");

                    AouH = input.next().toUpperCase().charAt(0);

                    if (AouH == 'A'){

                        System.out.println("NORMALMENTE A MÉDIA É DE 130 AULAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE AULAS QUE O PROFESSOR REALIZOU NESTE MÊS:");
                        aula = input.nextInt();

                        salario1 = (aula * 12);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario1 + " PELAS " + aula + " AULAS");

                        break;

                    } else if (AouH == 'H'){System.out.println("NORMALMENTE A MÉDIA É DE 160 HORAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE HORAS DADAS PELO PROFESSOR");

                        hora = input.nextDouble();

                        salario1 = (hora * 12);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario1 + " PELAS " + hora + " DADAS");

                        break;

                    } else {
                        System.out.println("DIGITE UM VALOR VALIDO!!!!");
                    }

                case 2:

                    System.out.println("\nPROFESSORES NÍVEL 2 RECEBEM R$17,00 POR HORA/AULA");

                    System.out.println("GOSTARIA DE CALCULAR O SALÁRIO POR HORA OU POR AULA?");
                    System.out.println("DIGITE (H) PARA HORAS E (A) PARA AULAS");

                    AouH = input.next().toUpperCase().charAt(0);

                    if (AouH == 'A'){

                        System.out.println("NORMALMENTE A MÉDIA É DE 130 AULAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE AULAS QUE O PROFESSOR REALIZOU NESTE MÊS:");
                        aula = input.nextInt();

                        salario2 = (aula * 17);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario2 + " PELAS " + aula + " AULAS");
                        break;
                    } else if (AouH == 'H'){System.out.println("NORMALMENTE A MÉDIA É DE 160 HORAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE HORAS DADAS PELO PROFESSOR");

                        hora = input.nextDouble();

                        salario2 = (hora * 17);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario2 + " PELAS " + hora + " DADAS");
                        break;
                    } else {
                        System.out.println("DIGITE UM VALOR VALIDO!!!");
                    }
                case 3:
                    System.out.println("\nPROFESSORES NÍVEL 3 RECEBEM R$25,00 POR HORA/AULA");

                    System.out.println("GOSTARIA DE CALCULAR O SALÁRIO POR HORA OU POR AULA?");
                    System.out.println("DIGITE (H) PARA HORAS E (A) PARA AULAS");

                    AouH = input.next().toUpperCase().charAt(0);

                    if (AouH == 'A'){

                        System.out.println("NORMALMENTE A MÉDIA É DE 130 AULAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE AULAS QUE O PROFESSOR REALIZOU NESTE MÊS:");
                        aula = input.nextInt();

                        salario3 = (aula * 25);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario3 + " PELAS " + aula + " AULAS");
                        break;
                    } else if (AouH == 'H'){System.out.println("NORMALMENTE A MÉDIA É DE 160 HORAS POR MÊS");
                        System.out.println("\nDIGITE O NÚMERO DE HORAS DADAS PELO PROFESSOR");

                        hora = input.nextDouble();

                        salario3 = (hora * 25);

                        System.out.println("O PROFESSORE NÍVEL 1 DEVE RECEBER R$" + salario3 + " PELAS " + hora + " DADAS");
                        break;
                    } else {
                        System.out.println("DIGITE UM VALOR VALIDO!!!");
                    }
                default:
                    System.out.println("DIGITE UMA OPÇÃO VALIDA....");
            }

        }while (opt >= 0);
    }
}
