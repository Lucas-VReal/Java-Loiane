package Aulas.Aula25;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros; // numero de passageiros
    public double capCombustivel; //capacidade do tanque de combustível
    public double consumoCombustivel; //consumo de combustível por km



    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    public Carro(){}


    public void exibirAutonomia() { //método sempre começa com um verbo por boas práticas

        System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " Km");
    }
}
