package Exercicios.Aulas16a17;

public class Fibonachi {
    public static void main(String[] args) {

        int f = 0;
        int n[];
        n = new int[500];
        n[0] = 1;

        for (int i=0; i < 500; i++) {
            f = f + n[i];
            n[i + 1] = n[i] + f;
            System.out.println(n[i]);
        }


    }
}
