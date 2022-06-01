package Exercicios.Aula34;

import java.util.Scanner;

public class Contador {

    private static int [] count;
    static Scanner scan = new Scanner(System.in);

    static int contador (int x){
        System.out.println("Informe o último número a ser contabilizado: ");
        int limite = scan.nextInt();
        if (limite>x){
            limite = limite - x;
        }
        count = new int [limite];
        for(int i = 0; i < count.length; i++) {
            x++;
            count[i] = x;
            System.out.println(count[i]);
        }
        return x;
    }

    static int contador (int x, int y){
        int limite = y;
        count = new int [limite];
        for(int i = 0; i < count.length; i++) {
            x++;
            count[i] = x;
            System.out.println(count[i]);
        }
        return x;
    }

    static int menu (int ultimo){
        System.out.println(" _______________________ "); System.out.println("|                       |"); System.out.println("|       Contador        |"); System.out.println("|                       |"); System.out.println(" ----------------------- ");
        System.out.println("");
        boolean continuar = true;
        while (continuar == true) {
            int num = 0;
            int result = 0;
            System.out.println("Digite: ");
            System.out.println("1. Para Iniciar o contador  ");
            System.out.println("2. Para reiniciar o contador");
            System.out.println("3. Para zerar o contador    ");
            System.out.println("4. Mostrar o valor atual    ");
            System.out.println("5. Para encerrar a contagem ");
            num = scan.nextInt();
            if (num == 5) {
                continuar = false;
                return result;
            }
            result = opcoes(num, ultimo);
            ultimo = result;
        }

        return ultimo;
    }

    static int opcoes (int y, int x){
        boolean numerovalido = false;
        while (!numerovalido) {

            if (y < 0 || y > 4) {
                menu(x);
            } else {
             switch (y){
                case 1:  return contador(x);
                 case 2: return contador(0);
                 case 3: return contador(0, 0);
                 case 4: System.out.println("O último número foi " + x); System.out.println();return x;
             }
                numerovalido = true;
            }
        }

        return x;
    }


    public static void main(String[] args) {

        menu(0);


    }
}


