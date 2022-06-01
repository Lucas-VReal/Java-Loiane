package Exercicios.Aulas28a33;


public class ExJogoDaVelha {
    public static void main(String[] args) {
        JogoDaVelha jv = new JogoDaVelha();
        jv.setJogada(1);
        boolean ganhou = false;
        char [][] jogo = new char [3][3];

        while (!ganhou){

            jv.setSinal(jv.quemJoga());
            jv.setLinha(jv.verificarLinha());
            jv.setColuna(jv.verificarColuna());


            if (jogo [jv.getLinha()] [jv.getColuna()] == 'X' || jogo [jv.getLinha()] [jv.getColuna()] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            }else {
                jogo[jv.getLinha()][jv.getColuna()] = jv.getSinal();
                jv.setJogada(jv.getJogada() + 1);
            }

            for(int i = 0; i <jogo.length; i++){
                for (int i2 = 0; i2 < jogo[i].length; i2++){
                    System.out.print(jogo[i][i2] + "|");
                }
                System.out.println();
            }

            if ((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') || (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') || (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X')){
                System.out.println("Parabéns, jogador 1 ganhou!");
                ganhou = true;
            } else if((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') || (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') || (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') || (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') || (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') || (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') || (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O')) {
                System.out.println("Parabéns, jogador 2 ganhou!");
                ganhou = true;
            } else if (jv.getJogada() > 9){
                System.out.println("Ninguém ganhou, deu velha!");
                ganhou = true;
            }
        }
    }
}
