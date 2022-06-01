package Exercicios.Aulas28a33;

import java.util.Scanner;

public class JogoDaVelha {

    private int jogada = 1;
    private char sinal; private int linha = 0; private int coluna = 0;
    Scanner scan = new Scanner(System.in);


    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public char getSinal() {
        return sinal;
    }

    public char setSinal(char sinal) {
        return sinal;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public char quemJoga (){
        if (jogada % 2 == 1){
            System.out.println("Vez do Jogador 1, escolha a linha e coluna");
            sinal = 'X';
        } else {
            System.out.println("Vez do Jogador 1, escolha a linha e coluna");
            sinal = 'O';
        }
        return sinal;
    }

    public int verificarLinha (){
        int L = 0;
        boolean linhaValida = false;
        while (!linhaValida) {
            System.out.println("Entre com a linha 1, 2 ou 3");
            L = scan.nextInt();
            if (L >= 1 && L <=3){
                linhaValida = true;
                L--;
            } else{
                System.out.println("Entrada Inválida, tente novamente");
            }
        }
        return L;
    }

    public int verificarColuna (){
        int C = 0;
        boolean colunaValida = false;
        while (!colunaValida) {
            System.out.println("Entre com a coluna 1, 2 ou 3");
            C = scan.nextInt();
            if (C >= 1 && C <=3){
                colunaValida = true;
                C--;
            } else{
                System.out.println("Entrada Inválida, tente novamente");
            }
        }
        return C;
    }



}
