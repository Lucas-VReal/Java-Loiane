package Aulas.Aula19;

import java.util.Scanner;

public class Multiplosde5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero do intervalo de 10: ");
        int n = scan.nextInt();
        int n1 = n;
        int Tot5 = 0;
        if (n % 5 == 0) {
            Tot5++;
            System.out.println("N�mero multiplo de 5: " + n);
        }
        for (int i = 0; i <= 10; i++){
            n++;
            if (n % 5 == 0){
                Tot5++;
                System.out.println("N�mero multiplo de 5: " + n);
            }
        }
        int n2 = n1 + 10;
        System.out.println("");
        System.out.println("O Total de n�meros multiplos de 5 no intervalo entre "+  n1 + " e "  +n2+ " = "+ Tot5);


    }
}
