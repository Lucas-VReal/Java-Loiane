package Aulas.Aula45;

import Aulas.Aula42.Professor;

public class Teste {

    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //Upcasting

        Pessoa aluno2 = (Pessoa) new Aluno(); //Upcasting e Convers�o. Muito comum em projetos Hybernate

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if(pessoa instanceof Pessoa){
            System.out.println("� do tipo Pessoa");
        }

        if(aluno instanceof Aluno){
            System.out.println("� do tipo Aluno");
        }

        if(prof instanceof Professor){
            System.out.println("� do tipo Professor");
        }

    }
}
