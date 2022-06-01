package Exercicios.Aulas16a17;


import java.util.Scanner;

public class LogineSenha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu Login: ");
        System.out.println("");
        String Login = scan.next();
        int i = 0;
        do {
            System.out.println("Digite a sua senha: ");
            String pass = scan.next();
            if (pass.equalsIgnoreCase(Login)){
                System.out.println(" A senha não pode ser igual ao Login. Tente Novamente!");
            } else {
                i++;
            }
        } while (i < 1);


    }
}
