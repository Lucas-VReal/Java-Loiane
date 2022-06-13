package Aulas.Aula52;

public class DivisaoNaoExata extends Exception{
    private int num;
    private int denominador;

    public DivisaoNaoExata(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }

    public String toString() {
        return "Resultado de " + num + "/" + denominador + " não é um inteiro!";
    }
}
