package Aulas.Aula16;

public class While {
    public static void main(String[] args) {

        int i = 0;
        int max = 10;


        System.out.println("Contando até "+ max);
        System.out.println("");
        while (i<= max){
            System.out.println("Valor de i: " + i);
            i++; //mesma coisa de i = i + 1 ou i +=1
        }
    }
}
