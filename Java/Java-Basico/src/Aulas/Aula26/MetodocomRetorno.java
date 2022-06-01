package Aulas.Aula26;
/*
void = vazio/ nenhum retorno

double obterAutonomia (){

        System.out.println("Método obter autonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
    }

 */


public class MetodocomRetorno {

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

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é " + autonomia);


    }
}
