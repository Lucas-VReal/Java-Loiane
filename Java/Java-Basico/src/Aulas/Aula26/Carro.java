package Aulas.Aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; //consumo de combustível por km

    double obterAutonomia (){

        System.out.println("Método obter autonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
    }
}
