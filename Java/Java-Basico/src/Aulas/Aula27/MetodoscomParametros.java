package Aulas.Aula27;

/*

Exemplo de M�todo Simples:

void exibirAutonomia () {
    System.out.println ("A autonomia do carro � " + capCombustivel * consumoCombustivel + " Km");
}

Exemplo de M�todo com Retorno:

Tipo de dado -> double

double obterAutonomia (){

        System.out.println("M�todo obter autonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
}

Exemplo de M�todo com Par�metro:

double calcularCombustivel (double km){
    return km/consumoCombustivel;
}



 */


public class MetodoscomParametros {

    public static void main(String[] args) {

        Carro van = new Carro(); //Declarada em Atributos
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println("");

        double qtdConbustivel10 = van.calcularCombustivel(10);
        double qtdConbustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdConbustivel10 = " + qtdConbustivel10);
        System.out.println(" ");
        System.out.println("qtdConbustivel15 = " + qtdConbustivel15);


    }
}
