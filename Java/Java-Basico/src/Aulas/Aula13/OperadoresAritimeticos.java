package Aulas.Aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        System.out.println(" Operações Aritméticas: ");
        System.out.println("");
        int resultados = 1 + 2;
        System.out.println("1 + 2 = " + resultados);
        System.out.println("");
        int resultados2 = resultados = resultados - 1;
        System.out.println(resultados + " - 1 = " + resultados2);
        System.out.println("");
        resultados = resultados2 * 3;
        System.out.println(resultados2 + " * 3 = " + resultados);
        System.out.println("");
        resultados2 = resultados / 2;
        System.out.println(resultados + " / 2 = " + resultados2);
        System.out.println("");
        resultados = (resultados2 % 2);
        System.out.println("O resto da divisão de " + resultados2 + " / 2 = " + resultados);
        System.out.println("");

        System.out.println("Fazendo a soma usando ++ depois: " + resultados + " + 1 = ");
        resultados++;
        System.out.println(resultados);
        System.out.println("");

        System.out.println("Fazendo a soma usando ++ antes: " + resultados + " + 1 = ");
        System.out.println(++resultados);
        System.out.println("");

        System.out.println("Fazendo a subtração usando -- depois: " + resultados + " - 1 = ");
        resultados--;
        System.out.println(resultados);
        System.out.println("");

        System.out.println("Fazendo a subtração usando -- antes: " + resultados + " - 1 = ");
        System.out.println(--resultados);
        System.out.println("");
    }
}
