package Aulas.Aula44;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);
    }

    public Mamifero() {
    }

    public abstract String amamentar(String nome);

}