package Aulas.Aula41.Animal;

public class Papagaio extends Ave {

    public Papagaio(String nome) {
        super(nome);
    }

    public Papagaio() {
        super();
    }

    public String voar() {
        String voo = "Levantou voo";
        return voo;
    }

    public String emitirSom() {
        String som = "Papagaio: Piu piu";
        return som;
    }
}
