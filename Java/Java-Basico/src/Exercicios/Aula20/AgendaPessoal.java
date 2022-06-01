package Exercicios.Aula20;

import java.util.Scanner;

public class AgendaPessoal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[][] Mes = new String[31][24];
        boolean sair = false;
        String coment;
        int dia = 0;
        int horario = 0;

        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Deseja agendar um compromisso? [S/N]");
                String resposta = scan.next();
                switch (resposta) {
                    case "N":
                    case "n":
                    case "Não":
                    case "não":
                        i += 10;
                        sair = true;
                        continue;
                    default:
                        sair = false;
                }
                System.out.println(" ");

                System.out.print("Qual seria o dia? ");
                dia = scan.nextInt();
                if (dia > 31 || dia <= 0) {
                    System.out.println("Erro: O dia deve ser entre 1 e 31");
                    System.out.println(" ");
                    System.out.print("Qual seria o dia? ");
                    dia = scan.nextInt();
                } else {
                    System.out.print("Qual seria o horário? ");
                    horario = scan.nextInt();
                    if (horario > 24) {
                        horario = horario - 24;
                    }
                    System.out.println("Escreva um comentário para esse compromisso: ");
                    String x = scan.nextLine();
                    coment = x;
                    Mes[dia][horario] = coment;
                }

            } while (sair == !true);
        }

        for (int i = 0; i < 31; i++) {
            for (int i2 = 0; i2 < 24; i2++) {
                if (Mes[i][i2] != null) {
                    System.out.println("No Dia " + i + " você têm compromisso às " + i2 + "horas: " + Mes[i][i2]);
                }
            }
        }

    }

}
