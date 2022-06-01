package Exercicios.Aula19;

import java.util.Scanner;

public class ArrayPar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Defina o valor inicial: ");
        int v = scan.nextInt();
        int [] par = new int[10];
        int TotPar = 0;
        if (v % 2 == 0){
            System.out.println("Valor par inicial: " + v);
            TotPar = TotPar +1;
        }
        for (int i = 0; i <= 9; i++){
            v++;
            par [i] = v;
            if (par[i] % 2 == 0){
                System.out.print(v + ", ");
                TotPar = TotPar + 1;
            }
        }
        System.out.println("");
        System.out.println("O Total de Números pares foi de: "+ TotPar);
    }
}
