package Aulas.Aula45;

public class Professor  extends Pessoa {
    private String nomeCurso;
    private String salario;

    public Professor (){
        super();
    }

    public Professor(String nome, String endereco, String telefone, String nomeCurso, String salario) {
        super(nome, endereco, telefone);
        this.nomeCurso = nomeCurso;
        this.salario = salario;
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

    public String obterEtiquetaEndereco (){
        String s = "Endereço do Professor: ";
        s += super.getEndereco(); //ou this.getEndereco

        return s;
    }
}
