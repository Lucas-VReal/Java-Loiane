package Exercicios.Aulas11a13;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("    CALCULANDO A ÁREA DA CIRCUNFERÊNCIA ");
        System.out.print("Digite o valor do raio: ");
        double raio = scan.nextInt();
        double area = raio*3.6*3.6;
        System.out.println("A = pi.r^2");
        System.out.println("A = "+ raio + "* 3,6 * 3,6");
        System.out.println("");
        System.out.println("A Área da circunferência é "+ area+ "cm");

    }
}
