package Exercicios.Aulas16a17;

import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PaisA, PaisB, growthA, growthB = 0;
        int certo = 0;
        System.out.print("Digite a Popula��o Total do Pa�s A: ");
        PaisA = scan.nextDouble();

        do {
            System.out.print("Digite a porcentagem de crescimento da popula��o do Pa�s A: ");
            growthA = scan.nextDouble();
            if (growthA > 1) {
                growthA = (growthA / 100);
                certo++;
            }else
                certo++;
        } while (certo < 1);

        System.out.println("");
        certo = 0;
        do {
            System.out.print("Digite a Popula��o Total do Pa�s B: ");
            PaisB = scan.nextDouble();
            if (PaisA > PaisB) {
                System.out.println("Erro: A popula��o do Pa�s B deve ser maior que a do Pa�s A");
            } else
                certo++;
        } while (certo < 1);
        certo = 0;
        do {
            System.out.print("Digite a porcentagem de crescimento da popula��o do Pa�s B: ");
            growthB = scan.nextDouble();
        if (growthB > 1) {
                growthB = (growthB / 100);
                certo++;
            }
        if (growthA <= growthB) {
            System.out.println("Erro a porcentagem de crescimento B deve ser menor do que a de A");
            System.out.println("A popula��o A deve se igualar o passar de B");
        }else
            certo++;
        } while (certo < 1);

        System.out.println("");
        int age = 2022;

        for (PaisA = PaisA; PaisB >= PaisA; age++){
            PaisA = (PaisA*growthA)+PaisA;
            PaisB = (PaisB*growthB)+PaisB;
            System.out.println("O ano � "+ age + " e a popula��o do Pa�s A � de "+ Math.round(PaisA) + " habitantes / Pa�s B: "+ Math.round(PaisB));
        }

    }
}
