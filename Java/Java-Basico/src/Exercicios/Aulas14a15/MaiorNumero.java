package Exercicios.Aulas14a15;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = scan.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scan.nextDouble();

        if (n1>n2){
            System.out.println(n1 + " é o maior número digitado");
        } else if (n2>n1){
            System.out.println(n2 + " é o maior número digitado");
        } else {
            System.out.println(n1 + " e "+ n2 + " são iguais");
        }
    }
}
