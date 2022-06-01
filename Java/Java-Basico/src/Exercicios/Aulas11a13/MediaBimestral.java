package Exercicios.Aulas11a13;

import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println(" NOTAS DO BIMESTRE ");
        System.out.println(" ");
        System.out.print("Digite a nota do Primeiro bimestre: ");
        int b1 = scan.nextInt();
        System.out.print("Digite a nota do Segundo bimestre: ");
        int b2 = scan.nextInt();
        System.out.print("Digite a nota do Terceiro bimestre: ");
        int b3 = scan.nextInt();
        System.out.print("Digite a nota do Quarto bimestre: ");
        int b4 = scan.nextInt();
        int media = (b1 + b2 + b3 + b4)/4;
        System.out.println();
        System.out.println("A média do ano foi: "+ media);
        if (media > 6) {
            System.out.println();
            System.out.println("Parabéns! Você foi aprovado");
        }else System.out.println("Você foi reprovado");

    }
}
