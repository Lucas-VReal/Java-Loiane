package Aulas.Aula40;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno(); // tipo pessoa mas instânciado como Aluno
        Pessoa professor =new Professor();// tipo pessoa mas instânciado como Professor

        pessoa.setEndereco("Rua 1 Num 1");
        aluno.setEndereco("Rua 2 Num 2");
        professor.setEndereco("Rua 3 Num 3");

        System.out.println(pessoa.obterEtiquetaEndereco()); //método da super class Pessoa

        System.out.println(aluno.obterEtiquetaEndereco()); //método da subclass Aluno

        System.out.println(professor.obterEtiquetaEndereco());//método da subclass Professor
    }
}
