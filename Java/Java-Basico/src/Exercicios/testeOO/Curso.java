package Exercicios.testeOO;

public class Curso {
    private String nome;
    private Aluno[] aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String obterInfo (){
        String info= "Nome do curso: " + nome + "\n";
        for (Aluno alunos : aluno){
            info += alunos.obterInfo();
        }

        return info;
    }
}
