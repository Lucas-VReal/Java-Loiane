package Aulas.Aula47;

public class Excessao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1; //No java 4 arrays s�o 0, 1, 2 e 3.

            System.out.println("Esse texto n�o ser� impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excess�o: Acessar um �ndice do Vetor que n�o existe");
        }

        System.out.println("Esse texto ser� impresso ap�s a Exception");
    }

}
