package Aulas.Aula31;

public class Carro {

    //Atributos:

    public String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combust?vel
    private double consumoCombustivel; //consumo de combust?vel por km


    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {}

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Esse ? um construtor com 3 par?metros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 5);
        System.out.println("Esse ? um construtor com 2 par?metros");
    }

    //M?todos:

    public double dividirKMporCombustivel(double km){

        return km/consumoCombustivel;
    }

    public double calcularCombustivel (double km){

        return dividirKMporCombustivel(km);
    }

    public void exibirAutonomia (){
        System.out.println("A Autonomia do carro ? "+ capCombustivel * consumoCombustivel+ "Km");
    }

    public double obterAutonomia (){
        System.out.println(" O m?todo Autonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
}

