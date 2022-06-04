package Exercicios.Aula36;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nomeCurso = scan.nextLine();

        System.out.println("Entre com o horário do curso");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor");
        String nomeProfessor = scan.nextLine();

        System.out.println("Entre com o departamento do professor");
        String dep = scan.nextLine();

        System.out.println("Entre com o e-mail do professor");
        String email = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(dep);
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("-------Alunos-------");

        Aluno [] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++){

            scan.nextLine();

            System.out.println("Entre com o nome do "+ (i+1)+ "° aluno");
            String nomeAluno = scan.nextLine();


            System.out.println("Entre com a matrícula de "+ nomeAluno+": ");
            String matAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int n=0; n < 4; n++){
                System.out.println("Entre com a "+ (n+1)+ "° nota: ");
                notas[n] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
