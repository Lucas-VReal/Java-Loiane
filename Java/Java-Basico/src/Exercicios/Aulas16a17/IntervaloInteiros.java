package Exercicios.Aulas16a17;

import java.util.Scanner;

public class IntervaloInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o número inicial do intervalo: ");
        int n2 = scan.nextInt();
        int Soma = 0;
        System.out.println("");
        System.out.println("Entre: "+ n1 + " e "+ n2 + ": ");
        System.out.println("");
        for (int i = n1+1; i < n2; i++){
            System.out.print(i+ " ");
            Soma = Soma + i;
        }
        System.out.println(" ");
        System.out.println("");
        System.out.println("A Soma dos números que estão entre "+ n1 + " e "+ n2 + " corresponde a "+ Soma);



    }
}
