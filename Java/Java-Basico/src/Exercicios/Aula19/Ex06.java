package Exercicios.Aula19;

public class Ex06 {

    public static void main(String[] args) {
        String menu = "         C = A + B            ";
        int[] C;

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(10);
        rs.setVetorB(10);

        C = new int [rs.getVetorA().length];

        rs.somarAmaisB(C);

    }
}
