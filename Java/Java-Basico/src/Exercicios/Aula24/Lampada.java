package Exercicios.Aula24;

import java.text.DecimalFormat;

public class Lampada {


    public static void main(String[] args) {

        class lampada {
            String [] tipos;
            int potencia;
            double preco;
        }



        lampada lamp = new lampada();
        lamp.potencia = 12;
        lamp.preco = 5.59;
        String Pattern = "##,##.00";
        DecimalFormat df = new DecimalFormat(Pattern);
        lamp.tipos = new String[2];
        lamp.tipos [0] = "led";
        lamp.tipos [1] = "normal";

        System.out.println(" A Lâmpada é do tipo "+ lamp.tipos[0] + ", têm a Potência de " + lamp.potencia + " Watts, e custa R$ "+ df.format(lamp.preco));
        System.out.println(" ");
        System.out.print("Tipos Existentes: ");
        for ( String i :lamp.tipos ){
            System.out.print( i+ " ");
        }

    }


}
