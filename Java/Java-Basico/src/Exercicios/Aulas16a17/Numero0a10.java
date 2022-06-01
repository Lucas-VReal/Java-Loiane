package Exercicios.Aulas16a17;

import java.util.Scanner;

public class Numero0a10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;
        do{
            System.out.println("Digite uma nota de 0 a 10");
            int nota = scan.nextInt();
            if (nota >= 0 && nota <= 10){
                System.out.println("A sua nota foi " + nota);
                x++;
            } else{
                System.out.println(" Você digitou uma nota inválida, tente novamente");
            }

        } while (x < 1);


    }
}
