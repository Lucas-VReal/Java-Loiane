package Exercicios.Aula19;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        String menu = "      B = A * 2     ";

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(8);
        rs.setVetorB(8);

        rs.definirBdobrodeA();


    }
}
