package Exercicios.Aula19;

public class Ex04 {
    public static void main(String[] args) {

        String menu = "    B = raiz quadrada de A    ";

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(15);
        rs.setVetordoubleB (rs.getVetorA().length);

        rs.definirBraizdeA();

    }
}
