package Exercicios.Aulas28a33;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String [] disciplina = new String [3];
    private double [] nota = new double[disciplina.length];

    public double[] getNota() {
        return nota;
    }

    public void setNota(double nota1, double nota2, double nota3) {
        this.nota[0] = nota1;
        this.nota[1] = nota2;
        this.nota[2] = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina1, String disciplina2, String disciplina3) {
        this.disciplina[0] = disciplina1;
        this.disciplina[1] = disciplina2;
        this.disciplina[2] = disciplina3;
    }

    //Metodos

    public void verificarseAprovado (String [] disciplina){
        for (int i = 0; i < disciplina.length; i++){
            System.out.println("A sua nota em "+ disciplina[i]+ " foi "+ nota[i]);
            if (nota[i] >= 7.0){
                System.out.println("Você foi aprovado em "+ disciplina[i]);
                System.out.println("");
            }else {
                System.out.println("Você foi reprovado em "+ disciplina[i]);
                System.out.println(" ");
            }
        }
    }

    public void identificacaoDoAluno(){
        System.out.println(" O Aluno "+ nome + " possui a matrícula n° "+ matricula+ " faz o curso "+curso+ " e está cursando: ");
        for (int i = 0; i < disciplina.length; i++){
            System.out.println((i+1) + ". "+ disciplina[i]);
        }
    }

}
