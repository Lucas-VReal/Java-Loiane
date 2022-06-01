package Exercicios.Aula34;

import java.util.Scanner;

public class Calculadora {


    //Metodos


    static double index (double x) {
        System.out.println(" _____________ ");
        System.out.println("| Calculadora |");
        System.out.println("|        "+x+"|");
        System.out.println("|       |     |");
        System.out.println("|             |");
        System.out.println("|1|2|3|4| |+|-|");
        System.out.println("|5|6|7|8| |*|/|");
        System.out.println("|             |");
        System.out.println("|____|        |");
        System.out.println(" ------------- ");
        return x;
    }
    static double index (double x, double y, String z) {
        double result = verificarCalculo(z, x, y);
        System.out.println(" _____________ ");
        System.out.println("| Calculadora |");
        System.out.println("|        _____|");
        System.out.println("|       |     |");
        System.out.println("|             |");
        System.out.println("|1|2|3|4| |+|-|");
        System.out.println("|5|6|7|8| |*|/|");
        System.out.println("|             |");
        System.out.println("|"+result+"|        |");
        System.out.println(" ------------- ");

        return result;
    }

    static double verificarCalculo(String z, double x, double y){
        Scanner scan = new Scanner(System.in);
        boolean sinalCerto = false;
        double [] potencia = new double [(int) y];
        double r = 10;

        while (!sinalCerto) {

            if (z.equals("+") | z.equals("-") | z.equals("*") | z.equals("/")) {
                switch (z) {
                    case "+": r = x + y;break;
                    case "-": r = x - y;break;
                    case "*": r = x * y;break;
                    case "/": r = x / y;break;
                }
                sinalCerto = true;

            }else if (z.equalsIgnoreCase("e")){
                for (int i = 1; i < potencia.length; i++){
                    x = x*x;
                }
                r = x;
                sinalCerto = true;
            } else{
                System.out.println(" Operador inválido");
                System.out.println("Escolha a operação desejada: + - * / e");
                z = scan.next();
            }
        }
        return r;
    }

    static boolean continuacao(double n1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja continuar? (S ou N)");
        String b = scan.next();

        if (b.equals("S") | b.equals("s")) {
            System.out.println("O primerio valor é " + n1);
            System.out.println();
            boolean resposta = false;
            return resposta;
        } else {
            System.out.println("O resultado final foi " + n1);
            System.out.println();
            System.out.println("Obrigado por participar :D");
            boolean resposta = true;
            return resposta;
        }
    }

    static void calculadora (){

        boolean continuar = false;
        double n1 = 0;
        double n2;
        Scanner scan = new Scanner(System.in);

        while (!continuar) {
            if (n1 <= 0) {
                System.out.print("Informe o primeiro número: ");
                n1 = scan.nextDouble();
                System.out.println();
                n1 = index(n1);
            }

            System.out.print("Informe o segundo número: ");
            n2 = scan.nextDouble();
            n2 = index(n2);

            System.out.println("Escolha a operação desejada: + - * / e (elevar)");
            String Operacao = scan.next();
            double r = index(n1, n2, Operacao);
            n1 = r;

            continuar = continuacao(n1);
        }


    }

}
