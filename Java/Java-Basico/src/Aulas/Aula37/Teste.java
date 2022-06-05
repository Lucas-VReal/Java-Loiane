package Aulas.Aula37;

public class Teste {

    // Herança só deve ser usada se for uma relação em que todos os Objetos são comuns para ambas as Classes

    public static void main(String[] args) {

        /*
        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        aluno.setNome("Maria");

         */

        Pessoa aluno = new Aluno(); //Pessoa Classe mãe e Aluno Classe filha
        //aluno.getCurso não funciona pq são atributos da filha

        Pessoa professor = new Professor(); //Pessoa Classe mãe e Professor Classe filha
        //professor.getSalario


    }
}
