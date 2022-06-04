package Exercicios.testeOO;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("Matemática" + "\n" + " ");
        Aluno[] alunos = new Aluno[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            Aluno aluno = new Aluno();
            System.out.println("Escreva o nome do " + (i+1) + "° aluno: ");
            String nomeAluno =scan.nextLine();
            aluno.setNome(nomeAluno);

            System.out.println("Escreva a matrícula de " + nomeAluno + ": ");
            String matriculaAluno = scan.nextLine();
            aluno.setMatricula(matriculaAluno);

            alunos[i] = aluno;
        }

        curso.setAluno(alunos);

        System.out.println(curso.obterInfo());



    }
}
