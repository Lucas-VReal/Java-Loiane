package Aulas.Aula14;

/*


 */


import java.util.Scanner;

public class IfeElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua idade: ");
        int age = scan.nextInt();

        if (age >= 18 ){
            System.out.print("� maior de idade");
        }else {
            System.out.print("N�o � maior de idade");
        }

    }
}
