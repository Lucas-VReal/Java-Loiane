package Aulas.Aula27;

public class Carro {
    //Atributos:

    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combust�vel
    double consumoCombustivel; //consumo de combust�vel por km

    //M�todos:

    double calcularCombustivel (double km){

        double qtdConbustivel = km/consumoCombustivel;

        return qtdConbustivel;
    }
}
