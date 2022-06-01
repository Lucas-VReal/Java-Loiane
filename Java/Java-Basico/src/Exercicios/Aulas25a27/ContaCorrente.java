package Exercicios.Aulas25a27;

import java.text.DecimalFormat;

public class ContaCorrente {

        public String agencia;
        public String numConta;
        public double saldo;
        public boolean especial;
        public double limiteEspecial;

        String Pattern = "R$ ###,##0.00#";
        DecimalFormat dc = new DecimalFormat(Pattern);

        public void mostrarSaldo() {
                System.out.print(" O Saldo da conta n° " + numConta + " de Agência n° " + agencia + ": ");
                System.out.print(dc.format(saldo));
                System.out.println(" ");
        }

        void verificarCrot() {
                if (especial == true) {
                        System.out.println("Limite CROT Disponível: " + dc.format(saldo * limiteEspecial));
                        saldo += (saldo * limiteEspecial);
                        mostrarSaldo();
                        System.out.println(" ");
                } else {
                        mostrarSaldo();
                        System.out.println(" ");
                }

        }

        void realizarSaque(double quantiaSaque) {

                if (quantiaSaque <= saldo) {
                        saldo -= quantiaSaque;
                        System.out.println("Você sacou o valor de " + dc.format(quantiaSaque));
                        mostrarSaldo();
                } else {
                        System.out.println("saldo insuficiente");
                }
        }

        void realizarDeposito(double valorDepositado) {
                if (valorDepositado > 0) {
                        saldo += valorDepositado;
                        System.out.println("Você depositou R$ " + dc.format(valorDepositado));
                        mostrarSaldo();
                        System.out.println("");
                } else {
                        System.out.println("Valor inválido");
                }
        }
}


