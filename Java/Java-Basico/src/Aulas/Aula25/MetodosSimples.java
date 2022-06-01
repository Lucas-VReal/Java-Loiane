package Aulas.Aula25;
/*
Revisão:

Classe: Declaração de entidade a qual se refere;
Entidade: Objeto;
Atrubutos: Definições da classe;
Métodos: Ações.

Métodos Simples: (Sem retorno ou parâmetro)





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
