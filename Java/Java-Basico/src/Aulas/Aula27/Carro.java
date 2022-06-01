package Aulas.Aula27;

public class Carro {
    //Atributos:

    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; //consumo de combustível por km

    //Métodos:

    double calcularCombustivel (double km){

        double qtdConbustivel = km/consumoCombustivel;

        return qtdConbustivel;
    }
}
