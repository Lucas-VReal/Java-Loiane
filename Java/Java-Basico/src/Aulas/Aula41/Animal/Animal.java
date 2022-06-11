package Aulas.Aula41.Animal;

public abstract class Animal {

    private String nome;

    public Animal() {

    }

    public Animal(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public abstract String emitirSom ();
}
