package Exercicios.Aula35;

public class Calculadora {

    public static int fibonachi (int num){

        if (num < 2 ){
            return 1;
        }

        return fibonachi(num - 1) + fibonachi(num -2);
    }

}
