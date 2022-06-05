package Aulas.Aula39;

public class Professor  extends Pessoa {
    private String nomeCurso;
    private String salario;

    public Professor (){
        super();
    }

    public void verificarAcesso(){

        this.nomeVisibilidade = "sassds";
        super.nomeVisibilidade = "akslaksçlka";

    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido (){
        return 0;
    }
}
