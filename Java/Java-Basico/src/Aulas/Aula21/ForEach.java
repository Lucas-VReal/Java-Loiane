package Aulas.Aula21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {

        int [] notas = new int [10];
        Random ramdom = new Random();

        for (int i = 0; i < notas.length; i++){

            notas [i] = ramdom.nextInt(10);

        }
        for (int i = 0; i < notas.length; i++){

            System.out.println(notas[i]);

        }
        System.out.println(" ");
        System.out.println("Usando o For Each:");
        System.out.println(" ");

        for (int nota : notas) {

            System.out.println(nota);

        }

        System.out.println(" ");
        System.out.println("Exemplo utilizando For Each com Matriz:");
        System.out.println(" ");
        double [] [] notasAlunos = new double [3] [4];

        notasAlunos[0] [0] = 3;
        notasAlunos[0] [1] = 8;
        notasAlunos[0] [2] = 4;
        notasAlunos[0] [3] = 1;

        notasAlunos[1] [0] = 5;
        notasAlunos[1] [1] = 9;
        notasAlunos[1] [2] = 2;
        notasAlunos[1] [3] = 0;

        notasAlunos[2] [0] = 8;
        notasAlunos[2] [1] = 3;
        notasAlunos[2] [2] = 1;
        notasAlunos[2] [3] = 7;
        for ( double [] notasAluno : notasAlunos){
            for (double nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println("");
        }



    }
}
