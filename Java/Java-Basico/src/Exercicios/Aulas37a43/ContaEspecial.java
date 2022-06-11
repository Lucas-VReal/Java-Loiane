package Exercicios.Aulas37a43;

public class ContaEspecial extends ContaBancaria{

    private double limite = 500;

    public ContaEspecial() {
        super();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double sacar(double valorSaque) {
        super.setSaldo(super.getSaldo() + this.limite);
        System.out.println("O seu saldo é de R$ "+ super.getSaldo() + " sendo R$ " + this.limite+ " referente ao limite de CROT");
        return super.sacar(valorSaque);
    }

    @Override
    public double calcularNovoSaldo(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}
