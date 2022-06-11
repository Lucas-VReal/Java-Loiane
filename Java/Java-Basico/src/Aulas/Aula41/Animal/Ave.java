package Aulas.Aula41.Animal;

public abstract class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
    }
    public abstract String voar ();

    public Ave() {
        super();
    }

    public String emitirSom (){
        return "Piu Piu";
    }

}
