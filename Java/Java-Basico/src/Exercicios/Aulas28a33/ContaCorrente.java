package Exercicios.Aulas28a33;

import java.text.DecimalFormat;

public class ContaCorrente {

    private String agencia;
    private String numConta;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    String Pattern = "R$ ###,##0.00#";
    DecimalFormat dc = new DecimalFormat(Pattern);

    public void mostrarSaldo() {
        System.out.print(" O Saldo da conta n° " + numConta + " de Agência n° " + agencia + ": ");
        System.out.print(dc.format(saldo));
        System.out.println(" ");
    }

    public void mostrarNovoSaldo() {
        System.out.print(" O Novo Saldo da conta é: ");
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
            mostrarNovoSaldo();
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    void realizarDeposito(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            System.out.println("Você depositou R$ " + dc.format(valorDepositado));
            mostrarNovoSaldo();
            System.out.println("");
        } else {
            System.out.println("Valor inválido");
        }
    }
}



