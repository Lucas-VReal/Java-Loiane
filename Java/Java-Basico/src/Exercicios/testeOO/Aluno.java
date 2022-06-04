package Exercicios.testeOO;

public class Aluno {

    private String nome;
    private String matricula;

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
    public String obterInfo (){
        String info = "Nome do aluno " + nome + "\n";
        info += "Matícula do Aluno: " + matricula + "\n" + " " + "\n";

        return info;
    }
}
