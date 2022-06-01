package Aulas.Aula19;

public class Arrays {
    public static void main(String[] args) {
/*
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
*/
        double [] temperaturas = new double[365];
        for (int i=0; i< temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia "+ (i+1) + "é: "+ temperaturas[i]);
        }

        for (double temp: temperaturas){
            System.out.println(temp);
        }

    }
}
