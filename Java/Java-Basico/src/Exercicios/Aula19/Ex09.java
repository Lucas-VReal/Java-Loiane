package Exercicios.Aula19;

public class Ex09 {
    public static void main(String[] args) {

        String menu = " Divisão com 3 Vetores  ";
        int[] C;

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(10);
        rs.setVetorB(10);

        C = new int [rs.getVetorA().length];

        rs.dividirAporB(C);


    }
}
