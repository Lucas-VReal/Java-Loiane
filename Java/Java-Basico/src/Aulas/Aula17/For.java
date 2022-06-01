package Aulas.Aula17;

/*
Comando For:

        Executa um bloco de código que está dentro
        do comando for enquanto uma expressão for verdadeira.

*/

public class For {
    public static void main(String[] args) {

        //FOR NORMAL

        System.out.println("Crescente:");
        System.out.println("");
       for(int i = 0; i< 5; i++){
           System.out.println("i tem valor: " + i);
       }

        System.out.println("");
        System.out.println("Decrescente:");
        System.out.println("");
       for(int i = 5; i> 0; i--){
            System.out.println("i tem valor: " + i);
        }
        System.out.println("");

        //FOR COM MAIS DE UMA VARIÁVEL

        for (int i=0, j=10; i<j; i++, j--) {
            System.out.println("i = "+ i + " j = "+ j);
        }
        //FOR sem variável

        System.out.println("");
        int count = 0;
        for( ;count < 10;) {
            System.out.println("O Valor de count = "+ count);
            count+= 2;
        }

    }

}
