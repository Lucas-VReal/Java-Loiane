package Exercicios.Aula19;

public class Ex10 {

    public static void main(String[] args) {

        String menu = " B = Resto da divisão de A por 2  ";

        Resources rs = new Resources();
        rs.menu(menu);
        rs.setVetorA(10);
        rs.setVetordoubleB(rs.getVetorA().length);

        rs.restoDaDivisaoDeApor2();

    }
}
