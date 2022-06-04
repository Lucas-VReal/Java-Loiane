package Exercicios.Aula36;

public class Curso {

    private String nome;
    private String horario;

    private Professor professor;

    private Aluno[] alunos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo (){
        String info = "Nome do Curso = " + nome + "\n";

        if (professor != null){
            info += professor.obterInfo();
            info += "\n" + " " + "\n";
        }

        if (alunos != null) {
            info += "-------Alunos------" + "\n";
            for (Aluno aluno : alunos){
                    info += aluno.obterInfo() + "\n";
            }
            info += "\n" + "Media da Turma = " + obterMediaTurma();
        }

        return info;
    }

    public double obterMediaTurma (){
        double soma = 0;
        for (Aluno aluno : alunos){
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }

        return soma/alunos.length;
    }
}
