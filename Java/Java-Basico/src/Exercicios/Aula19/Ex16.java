package Exercicios.Aula19;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] VetorA = new int[10];
        int Position = 1;
        int soma = 0;
        int soma15 = 0;
        int somaM15 = 0;
        int element = 0;

        for (int i=0;i < VetorA.length; i++){
            Position = i + 1;
            System.out.print("Escreva o " + Position + "° número: ");
            VetorA[i] = scan.nextInt();
            if (VetorA[i] < 15) {
                soma += VetorA[i];
            } else if (VetorA[i] == 15){
                soma15 += VetorA[i];
            } else{
                somaM15 += VetorA[i];
                element++;
            }
        }
        System.out.println(" ");
        System.out.print("A soma dos valores menores que 15 é: "+ soma);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("A soma dos valores iguais a 15 é: "+ soma15);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("A média dos valores maiores que 15 é: "+ (somaM15/element));
        System.out.println(" ");

    }
}
