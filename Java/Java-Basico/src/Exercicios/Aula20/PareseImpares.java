package Exercicios.Aula20;

import java.util.Scanner;

public class PareseImpares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] [] M = new int [3][3];
        int CountPar = 0;
        int CountImpar = 0;
        int x = 0;

        for (int i=0; i < 3; i++){
            System.out.println(" ");
            for (int i2=0; i2 < 3; i2++){
                x += 1;
                System.out.print("Escreva o "+ x +"° valor: ");
                M[i] [i2] = scan.nextInt();
                if (M [i] [i2] % 2 == 0){
                    CountPar += 1;
                } else{
                    CountImpar +=1;
                }
            }
        }
        System.out.print("Números Digitados: ");
        for (int i=0; i<3; i++){
            for (int i2=0; i2<3; i2++){
                System.out.print(M [i] [i2]+ " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Total de Números Pares: "+ CountPar);
        System.out.println(" ");
        System.out.println("Total de Números Ímpares: "+ CountImpar);
    }
}
