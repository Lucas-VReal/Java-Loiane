package Aulas.Aula47;

public class Excessao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1; //No java 4 arrays são 0, 1, 2 e 3.

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excessão: Acessar um índice do Vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a Exception");
    }

}
