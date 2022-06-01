package Exercicios.Aulas25a27;

public class Lampada {

    boolean ligada;

    void ligar (){
        ligada = true;
    }

    void desligar (){
        ligada = false;
    }
    void mostrarEstado (){
        if (ligada){
            System.out.println("A lâmpada está ligada");
        } else{
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada){
            desligar();
            System.out.println("Click ");
            System.out.println(" ");
        } else {
            ligar();
            System.out.println("Click ");
            System.out.println(" ");
        }

    }

}

