package Exercicios.Aula20;

import java.util.Random;

public class MaioreMenorValor {

    public static void main(String args[]) {
        Random rand = new Random(); //instance of random class
        int valor = 10;
        int[][] Matriz = new int[10][10];
        int maior = 0;
        int menor = 0;
        int linha = 0; int coluna = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int i2 = 0; i2 < 10; i2++) {
                Matriz[i][i2] = rand.nextInt(valor);
                System.out.println("Na coluna " + i + " e linha " + i2 + " o valor recebido foi: " + Matriz[i][i2]);
                if (i2 ==5) {
                    if (Matriz [i] [i2] <= menor){
                        menor = Matriz [i] [i2];
                        coluna = i;
                    }
                }
                if (i ==7){
                    if (Matriz [i] [i2] > maior){
                        maior = Matriz [i] [i2];
                        linha = i2;
                    }
                }

            }

        }

        System.out.println(" ");
        System.out.println("O maior valor na coluna 7 está na linha: " + linha);
        System.out.println("O maior valor foi: " + maior);
        System.out.println(" ");
        System.out.println("O menor valor está na linha 5 está na coluna: " + coluna);
        System.out.println("O menor valor foi: " + menor);


    }
}
