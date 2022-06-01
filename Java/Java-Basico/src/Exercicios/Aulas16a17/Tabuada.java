package Exercicios.Aulas16a17;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número o qual deseja ver a tababuada: ");
        int n = scan.nextInt();
        System.out.println("");

        System.out.println("Tabuada de "+ n + ":");
        for (int i = 0; i < 11; i++) {
            int m = n*i;
            System.out.println(n + " x "+ i + " = "+ m);
        }

    }
}
