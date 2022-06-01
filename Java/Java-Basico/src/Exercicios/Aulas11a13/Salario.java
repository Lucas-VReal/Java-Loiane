package Exercicios.Aulas11a13;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Calculando o salário ");
        System.out.println("");

        System.out.print("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("Quanto "+ nome+ " ganha por hora? ");
        double salario = scan.nextDouble();
        System.out.println("");

        System.out.print("Quantas horas "+ nome+ " trabalha por dia? ");
        double horas = scan.nextDouble();
        System.out.println("");

        System.out.print("Quantos dias "+ nome+ " trabalha por semana? ");
        double semana = scan.nextDouble();
        System.out.println("");

        double salarioTot = (salario*horas)*(semana*4);
        System.out.println("O(A) Funcionário(a) "+ nome + " ganhou um total de R$ "+ salarioTot + " reais esse mês");

    }
}
