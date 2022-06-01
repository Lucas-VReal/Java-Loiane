package Aulas.Aula13;

public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;

        // o curto circuito sabe que no & basta um falso, então ele ignora a segunda variável
        System.out.println(resultado);
        System.out.println(resultado2);



    }
}
