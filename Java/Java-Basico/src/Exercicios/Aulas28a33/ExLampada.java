package Exercicios.Aulas28a33;

import java.util.Scanner;

public class ExLampada {

    public static void main(String[] args) {

        Lampada lp = new Lampada();

        lp.setPreco(10.00);
        lp.setEstado("Ligada");

        Scanner scan = new Scanner(System.in);

        System.out.println("A l�mpada atualmente est� desligada deseja ligar? S para Sim ou N para N�o");
        String resposta = scan.nextLine();

        System.out.println("A Lamp�da atualmente est� "+ lp.interruptor(lp.dedao(resposta)));

        System.out.println("");

        System.out.println(lp.definirPreco(lp.getPreco())); //pega o valor preco e aplica na fun��o definir preco



    }
}
