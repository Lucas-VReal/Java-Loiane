package Exercicios.Aulas16a17;

import java.util.Scanner;

public class PareseImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n[];
        n = new int[11];
        int Par[];
        Par = new int[12];
        int Impar[];
        Impar = new int[12];

        for (int i = 1; i < 11; i++){
            System.out.print("Digite o "+ i + "° valor: ");
            n[i] = scan.nextInt();
            if (n[i] % 2 == 0){
                Par[i] = n[i];
            }else {
                Impar[i] = n[i];
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("São números pares: ");

        for (int i = 1; i < 11; i++) {
            if (Par[i] > 0) {
                System.out.print(Par[i]+ " ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("São números ímpares: ");
        for (int i = 1; i < 11; i++) {
            if (Impar[i] > 0) {
                System.out.print(Impar[i]+ " ");
            }
        }


    }
}
