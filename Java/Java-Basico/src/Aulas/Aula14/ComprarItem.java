package Aulas.Aula14;

import java.util.Scanner;

public class ComprarItem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do item R$: ");
        double item = scan.nextDouble();

        if (item <= 10){
            System.out.println("Está barato, pode comprar");
        } else if (10 < item && item < 15) {
            System.out.println("Está razoável, mas dá pra pedir desconto");
        } else  if (15 <= item && item > 17) {
            System.out.println("O preço não está bom, pesquise mais!");
        } else if (item >= 17){
            System.out.println( "Muito caro!");
        }
    }
}
