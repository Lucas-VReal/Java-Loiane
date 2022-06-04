package Exercicios.Aula36;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Aluno[] aluno = new Aluno[4];
        curso.setAluno(aluno);
        Scanner scan = new Scanner(System.in);
        curso.setAluno(aluno[0]).setNome("João");
        System.out.println(aluno[0].getNome()]);


        for (int i = 0; i < 4; i++){
            System.out.println("Escreva o nome do " + (i+1) + "º Aluno: ");
            String nome = scan.nextLine();

            aluno[i].setNome(nome);
            aluno[i].setMatricula("0000" + i+1);
            for (int n = 0; n < 4; n++) {
                double[] nota = new double[3];
                System.out.println("Qual foi a "+ (n+1) + "° Nota do " + nome + ": ");
                nota[n] = scan.nextDouble();
                aluno[i].setNota(new double[]{nota[n]}); // não aceita setNota(nota[n])
            }
        }
    }
}
