package Exercicios.Aulas11a13;

import java.util.Scanner;

public class CelsiuspFarenheint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é a sua temperaturam em Celsius? ");
        double grausc = scan.nextDouble();

        double grausf = ((grausc*9/5)+32);

        System.out.println("");
        System.out.println("A sua têmperatura é de "+ grausf + "ºF");

    }
}
