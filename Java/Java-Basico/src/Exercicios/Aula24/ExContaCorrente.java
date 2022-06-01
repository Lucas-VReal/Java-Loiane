package Exercicios.Aula24;

import java.text.DecimalFormat;

public class ExContaCorrente {
    public static void main (String [] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numConta = "123456";
        conta.agencia = "0021";
        conta.especial = true;
        conta.saldo = 10;
        conta.limiteEspecial = 0.05;
        String Pattern = "R$ ###,##0.00#";
        DecimalFormat dc = new DecimalFormat(Pattern);

        System.out.print(" O Saldo da conta n° "+ conta.numConta + " de Agência n° "+ conta.agencia+ ": ");
        System.out.print(dc.format(conta.saldo));
        System.out.println(" ");
        System.out.println(" ");
        if (conta.especial == true) {
            System.out.println("Limite CROT Disponível: " + dc.format(conta.saldo * conta.limiteEspecial));
            System.out.println("Saldo com limite: " + dc.format(conta.saldo + (conta.saldo * conta.limiteEspecial)));
        }

    }
}
