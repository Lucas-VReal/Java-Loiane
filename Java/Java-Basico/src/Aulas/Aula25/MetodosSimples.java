package Aulas.Aula25;
/*
Revis�o:

Classe: Declara��o de entidade a qual se refere;
Entidade: Objeto;
Atrubutos: Defini��es da classe;
M�todos: A��es.

M�todos Simples: (Sem retorno ou par�metro)





 */


public class MetodosSimples {

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

        van.exibirAutonomia();


    }


}
