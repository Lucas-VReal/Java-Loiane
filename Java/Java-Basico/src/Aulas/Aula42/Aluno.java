package Aulas.Aula42;

public class Aluno {

    private String curso;
    private String[] notas;

    public Aluno (){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, String[] notas) {
        //super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    public double calcularMedia (){
        return 0;
    }

    public Boolean verificarAprovado (){
        return true;
    }

    public String obterEtiquetaEndereco (){
        String s = "Endere�o do Aluno: ";
        //s += this.getEndereco(); //ou super.getEndereco

        return s;
    }


    public void imprimirEtiquetaDeEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}