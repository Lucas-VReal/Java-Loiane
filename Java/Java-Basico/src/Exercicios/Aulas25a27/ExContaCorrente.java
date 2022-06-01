package Exercicios.Aulas25a27;

import java.text.DecimalFormat;

public class ExContaCorrente {

    public static void main (String [] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numConta = "123456";
        conta.agencia = "0021";
        conta.especial = true;
        conta.saldo = 10;
        conta.limiteEspecial = 0.05;

        conta.mostrarSaldo ();

        System.out.println("");

        conta.verificarCrot();

        conta.realizarSaque(5);

        System.out.println("");

        conta.realizarDeposito(10);

    }
}

