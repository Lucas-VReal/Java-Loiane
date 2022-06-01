package Exercicios.Aula19;

public class Ex03 {

    public static void main(String[] args) {

        String menu = "      B = A²     ";

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(15);
        rs.setVetorB(rs.getVetorA().length);

        rs.definirBquadradodeA();

    }
}
