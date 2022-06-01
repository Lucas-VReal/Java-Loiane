package Exercicios.Aula19;

public class Ex05 {

    public static void main(String[] args) {

        String menu = "      B = A * Posição   ";

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(10);
        rs.setVetorB(rs.getVetorA().length);

        rs.definirBposicaodeA();

    }
}
