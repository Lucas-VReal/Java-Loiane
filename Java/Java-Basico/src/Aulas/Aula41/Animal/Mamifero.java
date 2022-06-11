package Aulas.Aula41.Animal;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);
    }

    public Mamifero() {}

    public abstract String amamentar (String nome);

    public String emitirSom (){
        return "roar";
    }

}
