package Aulas.Aula20;

import java.util.Scanner;

public class Notas4Alunos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] [] notasAlunos = new double[10][4];
        int x = 1;

        for(int i=0; i<10; i++){
            int aluno = 1;
            System.out.println(" ");
            for (int i2=0; i2<4; i2++){
                x =i+1;
                System.out.print("Escreva a "+ (aluno= i2+1) +"° nota do "+ x + "° Aluno: ");
                notasAlunos[i][i2] = scan.nextDouble();
            }


        }


    }
}
