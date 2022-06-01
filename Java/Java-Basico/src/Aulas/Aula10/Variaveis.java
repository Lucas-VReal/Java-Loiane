// Variável

// Como declarar?
// <tipo> <nome da variável>;
//          ou
//  <tipo> <nome da variável> = <valor>;

// Tipos primitivos
// INT( 5), FLOAT (0.5) , CHAR (CARACTERE)

public class Variaveis {
    public static void main(String[] args) {

        //convenção Java
        int idade = 20;
        String ano2022;
        String nomeDoMeuCachorro = "totó";
        String Nome = "Lucas";

        //aceito mas não utilizado
        int _idade;
        int $idade;

        //não é convenção Java
        String nomeDoMeucachorro; //só o "c" minúsculo, já é outra variável
        String NomeDoMeuCachorro;
        String nome_do_meu_cachorro;

        idade = 27;

        System.out.println("Idade = " + idade + " anos");
        System.out.println("Nome: " + Nome);

        // má pratica
        int a=10;
        int b = 20;
        String l = "Lucas";
    }
}