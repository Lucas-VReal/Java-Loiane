package Exercicios.Aula20;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char [] [] jogoVelha = new char [3] [3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal; int linha = 0; int coluna = 0;

        while (!ganhou){
            if (jogada % 2 == 1){
                System.out.println("Vez do Jogador 1, escolha a linha e coluna");
                sinal = 'X';
            } else {
                System.out.println("Vez do Jogador 1, escolha a linha e coluna");
                sinal = 'O';
            }

            boolean linhaValida = false;

            while (!linhaValida) {
                System.out.println("Entre com a linha 1, 2 ou 3");
                linha = scan.nextInt();
                if (linha >= 1 && linha <=3){
                    linhaValida = true;
                } else{
                    System.out.println("Entrada Inv�lida, tente novamente");
                }
            }

            boolean colunaValida = false;

            while (!colunaValida) {
                System.out.println("Entre com a Coluna 1, 2 ou 3");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <=3){
                    colunaValida = true;
                } else{
                    System.out.println("Entrada Inv�lida, tente novamente");
                }
            }

            linha--;
            coluna--;
            if (jogoVelha [linha][coluna] == 'X' || jogoVelha [linha][coluna] == 'O'){
                System.out.println("Posi��o j� usada, tente novamente");
            }else
                jogoVelha [linha] [coluna] = sinal;
            jogada++;

            //Print do Tabuleiro
            for(int i = 0; i <jogoVelha.length; i++){
                for (int i2 = 0; i2 < jogoVelha[i].length; i2++){
                    System.out.print(jogoVelha[i][i2] + "|");
                }
                System.out.println();
            }

            //Verificar se ganhou

            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')){
                System.out.println("Parab�ns, jogador 1 ganhou!");
                ganhou = true;
            } else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
                System.out.println("Parab�ns, jogador 2 ganhou!");
                ganhou = true;
            } else if (jogada > 9){
                System.out.println("Ningu�m ganhou, deu velha!");
                ganhou = true;
            }
        }
    }
}
