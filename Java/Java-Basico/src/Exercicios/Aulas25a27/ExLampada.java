package Exercicios.Aulas25a27;

public class ExLampada {

    public static void main(String[] args) {

        System.out.println(" Estado da L�mpada:");
        System.out.println(" ");

        Lampada lp = new Lampada();
        lp.ligar();

        lp.mostrarEstado();

        lp.mudarEstado();

        lp.mostrarEstado();

    }


}
