package Exercicios.Aula20;
import java.util.Random;

public class MaiorValor {
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        int valor = 100;
        int [] [] Matriz = new int [4][4];
        int maior = 0; int linha = 0; int coluna = 0;

        for (int i = 0; i < 4; i++){
            System.out.println(" ");
            for (int i2 = 0; i2 < 4; i2++){
                Matriz [i] [i2] = rand.nextInt(valor);
                System.out.println("Na coluna "+i+ " e linha "+ i2 +" o valor recebido foi: "+ Matriz[i] [i2]);
                if (Matriz [i] [i2] >= maior){
                    maior = Matriz [i] [i2];
                    coluna = i;
                    linha = i2;
                }

            }

        }
        System.out.println(" ");
        System.out.println("O maior valor está na coluna "+ coluna +" e na linha "+linha);
        System.out.println("O maior valor foi: "+ maior);


    }
}
