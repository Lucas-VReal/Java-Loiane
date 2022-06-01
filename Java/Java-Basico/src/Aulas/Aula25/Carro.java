package Aulas.Aula25;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros; // numero de passageiros
    public double capCombustivel; //capacidade do tanque de combust�vel
    public double consumoCombustivel; //consumo de combust�vel por km



    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    public Carro(){}


    public void exibirAutonomia() { //m�todo sempre come�a com um verbo por boas pr�ticas

        System.out.println("A autonomia do carro � " + capCombustivel * consumoCombustivel + " Km");
    }
}
