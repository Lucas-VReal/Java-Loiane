package Exercicios.Aulas16a17;

import java.util.Scanner;

public class SomaeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n[];
        n = new int[6];
        int Soma = 0;

        for (int i = 1; i < 6; i++){
            System.out.print("Digite o "+ i + "° valor: ");
            n[i] = scan.nextInt();
            Soma = Soma + n[i];
            }
        System.out.println("A Soma dos números digitados é: " + Soma);
        System.out.println("A Média dos números digitados é: " + Soma/5);
        }
    }
