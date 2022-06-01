package Exercicios.Aulas11a13;

import java.util.Scanner;

public class FarenheintpCelsius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é a sua temperaturam em Farenheints? ");
        double grausf = scan.nextDouble();

        double grausc = (5*(grausf-32)/9);

        System.out.println("");
        System.out.println("A sua têmperatura é de "+ grausc + "ºC");

    }
}
