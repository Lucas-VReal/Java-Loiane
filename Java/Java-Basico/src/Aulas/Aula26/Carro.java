package Aulas.Aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros
    double capCombustivel; //capacidade do tanque de combust�vel
    double consumoCombustivel; //consumo de combust�vel por km

    double obterAutonomia (){

        System.out.println("M�todo obter autonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
    }
}
