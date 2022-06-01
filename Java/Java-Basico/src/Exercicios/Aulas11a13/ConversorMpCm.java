package Exercicios.Aulas11a13;


import java.util.Scanner;

public class ConversorMpCm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a altura/largura em metros: ");
        double altura = scan.nextDouble();
        double media = altura*100;
        System.out.println((int)media + " centímetros");





    }
}
