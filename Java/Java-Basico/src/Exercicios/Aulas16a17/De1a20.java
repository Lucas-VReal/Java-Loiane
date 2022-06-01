package Exercicios.Aulas16a17;

public class De1a20 {
    public static void main(String[] args) {

        int i = 1;
        for (i = 1; i<21; i++){
            System.out.println(i);
        }
        System.out.println("");
        for (i = 1; i<21; i++){
            if (i < 20) {
                System.out.print(i + ", ");
            }else{
                System.out.println(i + ".");
            }
        }


    }
}
