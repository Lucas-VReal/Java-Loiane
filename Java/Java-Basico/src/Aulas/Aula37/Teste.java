package Aulas.Aula37;

public class Teste {

    // Heran�a s� deve ser usada se for uma rela��o em que todos os Objetos s�o comuns para ambas as Classes

    public static void main(String[] args) {

        /*
        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        aluno.setNome("Maria");

         */

        Pessoa aluno = new Aluno(); //Pessoa Classe m�e e Aluno Classe filha
        //aluno.getCurso n�o funciona pq s�o atributos da filha

        Pessoa professor = new Professor(); //Pessoa Classe m�e e Professor Classe filha
        //professor.getSalario


    }
}
