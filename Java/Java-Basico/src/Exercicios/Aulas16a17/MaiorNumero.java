package Exercicios.Aulas16a17;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, Nlower = 0;
        int Nupper = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            n1 = scan.nextInt();
            if (n1 > Nupper) {
                Nupper = n1;
            } else if (n1 < Nlower){
                Nlower = n1;
            }
}
        System.out.println("");
        System.out.println("O maior número digitado foi " + Nupper);
        System.out.println("");
        System.out.println("O menor número digitado foi " + Nlower);

    }
}
