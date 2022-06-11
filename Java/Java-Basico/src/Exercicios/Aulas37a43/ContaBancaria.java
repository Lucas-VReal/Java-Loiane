package Exercicios.Aulas37a43;

public abstract class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        super();
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
        super();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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

    public double sacar (double valorSaque){
        if (this.getSaldo() < 0 || this.getSaldo() < valorSaque){
            System.out.println("Saldo insuficiente para saque");
            return this.getSaldo();
        } else{
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Opera��o realizada com sucesso!" + "\n" + "Voc� sacou o valor de " + valorSaque + "\n" + "O seu saldo atual � de " + this.getSaldo());
            return getSaldo();
        }
    }

    public double depositar (double valorDeposito){
        if (valorDeposito > 0){
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Opera��o realizada com sucesso!" + "\n" + "Voc� depositou o valor de " + valorDeposito + "\n" + "O seu saldo atual sem limite de CROT � de " + this.getSaldo());
            return this.getSaldo();
        }else{
            System.out.println("Valor inv�lido!");
            return this.getSaldo();
        }
    }

    public abstract double calcularNovoSaldo ();

    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
