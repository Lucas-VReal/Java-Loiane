package Exercicios.Aulas11a13;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("  Programa de Soma ");
        System.out.println("");
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.println("");
        System.out.println("A soma entre "+ n1 +" + "+ n2 + " = "+ soma);

    }
}
