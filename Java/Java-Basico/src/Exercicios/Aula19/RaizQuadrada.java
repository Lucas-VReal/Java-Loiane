package Exercicios.Aula19;
import java.util.Scanner;
import java.text.DecimalFormat;

public class RaizQuadrada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int [5];
        double [] vetorB = new double [vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            int x = i + 1;
            System.out.print(" Digite o "+ x + "° valor de A: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            vetorB[i] = Math.sqrt(vetorB[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < vetorA.length; i++) {
            if (i == 0) {
                System.out.print("Valores de A: ");
            }
            if (i>= 0){
                System.out.print(vetorA[i]+ " ");
            }
        }
        DecimalFormat dc = new DecimalFormat("###,##.##");
        System.out.println(" ");

        for (int i = 0; i < vetorB.length; i++) {
            if (i == 0) {
                System.out.print("Valores de B: ");
            }
            if (i>= 0){
                System.out.print(dc.format(vetorB[i])+ " ");
            }
        }

    }
}
