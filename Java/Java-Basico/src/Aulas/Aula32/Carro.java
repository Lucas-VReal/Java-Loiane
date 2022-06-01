package Aulas.Aula32;


public class Carro {

    //Atributos:

    private String marca;
    private String modelo;
    private int numPassageiros; // numero de passageiros
    private double capCombustivel; //capacidade do tanque de combust�vel
    private double consumoCombustivel; //consumo de combust�vel por km

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

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
        System.out.println("Esse � um construtor com 3 par�metros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 5);
        System.out.println("Esse � um construtor com 2 par�metros");
    }

    //M�todos:

    double calcularCombustivel (double km){

        double qtdConbustivel = km/consumoCombustivel;

        return qtdConbustivel;
    }

    void exibirAutonomia (){
        System.out.println("A Autonomia do carro � "+ capCombustivel * consumoCombustivel+ "Km");
    }

    double obterAutonomia (){
        System.out.println(" O m�todo Autonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
}

