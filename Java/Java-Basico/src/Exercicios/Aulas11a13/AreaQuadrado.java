package Exercicios.Aulas11a13;


import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("    CALCULANDO A �REA DO QUADRADO ");
        System.out.println("");
        System.out.print("Digite o valor do lado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println("");
        System.out.println("A = base * altura");
        System.out.println("A = "+ lado + " * "+ lado);
        System.out.println("");
        System.out.println("A �rea do quadrado � "+ area+ " cm");
        System.out.println("");
        System.out.println("O dobro disso � " + (area*2));

    }
}
