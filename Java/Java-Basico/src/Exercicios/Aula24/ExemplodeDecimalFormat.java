package Exercicios.Aula24;

import java.text.DecimalFormat;

public class ExemplodeDecimalFormat {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");


        double numero = 15000;

        System.out.println(df.format(numero));

    }
}