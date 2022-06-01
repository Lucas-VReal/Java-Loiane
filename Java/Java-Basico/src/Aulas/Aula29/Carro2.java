package Aulas.Aula29;

import Aulas.Aula25.Carro;

public class Carro2 {
    public static void main(String[] args) {


        Carro van = new Carro("Fiat", "Ducato", 5, 55, 10);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.capCombustivel);
        System.out.println(van.numPassageiros);
        System.out.println(van.consumoCombustivel);

    }
}
