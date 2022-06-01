package Aulas.Aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;

        System.out.println("Operadores Lógicos");
        System.out.println("");
        System.out.println("valor 1 = 1 and valor 2 = 2? resultado: " + (valor1 == 1 & valor2 == 2));
        System.out.println("");
        System.out.println("valor 1 = 1 OR valor 2 = 2? resultado: " + (valor1 == 1 | valor2 == 2));
        System.out.println("");

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

    }
}
