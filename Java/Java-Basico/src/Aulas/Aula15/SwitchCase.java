package Aulas.Aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite com números um dia da semana (1 a 7): ");
        int diadasemana = scan.nextInt();
/*
        if (diadasemana == 1) {
            System.out.println("Domingo");
        } else if (diadasemana == 2) {
            System.out.println("Segunda");
        } else if (diadasemana == 3) {
            System.out.println("Terça");
        } else if (diadasemana == 4) {
            System.out.println("Quarta");
        } else if (diadasemana == 5) {
            System.out.println("Quinta");
        } else if (diadasemana == 6) {
            System.out.println("Sexta");
        } else if (diadasemana == 7) {
            System.out.println("Sábado");
        } else
            System.out.println("Não é um dia válido");
*/

        /*
        switch (diadasemana){
            case 1:
                System.out.println("Domingo");break;
            case 2:
                System.out.println("Segunda");break;
            case 3:
                System.out.println("Terça");break;
            case 4:
                System.out.println("Quarta");break;
            case 5:
                System.out.println("Quinta");break;
            case 6:
                System.out.println("Sexta");break;
            case 7:
                System.out.println("Sábado");break;
            default:
                System.out.println("Não é um dia válido");
        }
 */

        switch (diadasemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");break;
            case 1:
            case 7:
                System.out.println("Final de Semana");break;

        }
    }
}


