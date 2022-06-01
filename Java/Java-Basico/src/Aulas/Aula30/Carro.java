package Aulas.Aula30;

public class Carro {

    //Atributos:

    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; //consumo de combustível por km


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
        System.out.println("Esse é um construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 5);
        System.out.println("Esse é um construtor com 2 parâmetros");
    }

    //Métodos:

    double calcularCombustivel (double km){

        double qtdConbustivel = km/consumoCombustivel;

        return qtdConbustivel;
    }

    void exibirAutonomia (){
        System.out.println("A Autonomia do carro é "+ capCombustivel * consumoCombustivel+ "Km");
    }

    double obterAutonomia (){
        System.out.println(" O método Autonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
}
