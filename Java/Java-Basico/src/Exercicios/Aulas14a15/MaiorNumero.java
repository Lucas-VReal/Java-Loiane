package Exercicios.Aulas14a15;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        double n1 = scan.nextDouble();
        System.out.print("Digite outro n�mero: ");
        double n2 = scan.nextDouble();

        if (n1>n2){
            System.out.println(n1 + " � o maior n�mero digitado");
        } else if (n2>n1){
            System.out.println(n2 + " � o maior n�mero digitado");
        } else {
            System.out.println(n1 + " e "+ n2 + " s�o iguais");
        }
    }
}
