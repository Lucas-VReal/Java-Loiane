package Aulas.Aula28;

import Exercicios.Aulas25a27.ContaCorrente;

public class ExemploImportLocal {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.agencia = "0021";
        cc.saldo = 10;
        cc.numConta = "0002587-1";

        cc.mostrarSaldo();
    }

}
