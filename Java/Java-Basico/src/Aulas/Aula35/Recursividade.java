package Aulas.Aula35;

public class Recursividade {

    //Não Recursivo:

    public static int FatorialNaoRecursivo (int num1){

        if (num1 == 0){
            return 1;
        }

        int total = 1;

        for (int i = num1; i > 1; i--){
            total *=i;
        }
        return total;

    }

    public static int FatorialRecursivo (int num){

        if (num == 0){
            return 1;
        }

        return num * FatorialRecursivo(num -1);
    }

    // retorno final = 5 * !4 ->120

    // retorno1 final = 1
    // retorno2 final = 2 * !1
    // retorno3 final = 3 * !2
    // retorno4 final = 4 * !3
}
