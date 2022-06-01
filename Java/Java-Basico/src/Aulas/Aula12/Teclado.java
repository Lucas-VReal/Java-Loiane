//   Como ler dados do teclado

// - Ler uma Linha Inteira
// - Ler tipo de dado específico


package Aulas.Aula12;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Se nome é " + nomeCompleto);
        System.out.println("Digite o seu primeiro nome: ");

        // se colocar só "next" ele pega só a primeira palavra
        String primeiroNome = scan.next();
        System.out.println(" Seu primeiro nome é " + primeiroNome);
        System.out.println("");

        System.out.println(" Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos");

        System.out.println("Digite a sua altura");
        double altura = scan.nextInt();
        System.out.println(" A sua altura é: " + altura + "m");

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se têm bichinho de estimação");
        String primeiroNome2 = scan.next();
        int idade2 = scan.nextInt();
        byte dFilhos = scan.nextByte();
        double altura2 = scan.nextDouble();
        boolean temPet = scan.hasNextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("");
        System.out.println("Nome: " + primeiroNome);
        System.out.println("Idade: " + idade+ " anos");
        System.out.println("Quantidade de filhos: " + dFilhos + " Filhos");
        System.out.println("Altura: " + altura + "m");
        System.out.println(" Se têm pet: " + temPet);
    }
}
