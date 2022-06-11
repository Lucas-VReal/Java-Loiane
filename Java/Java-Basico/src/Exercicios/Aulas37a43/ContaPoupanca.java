package Exercicios.Aulas37a43;

public class ContaPoupanca extends ContaBancaria {

    private String diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, String diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca() {
        super();
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }



    public double calcularNovoSaldo (){
        System.out.println("Simulação de Rendimento:" + "\n" + "");
        diaRendimento = "10/";
        for (int i = 2; i<= 12; i++){
            this.setSaldo(this.getSaldo() + this.getSaldo()*0.05);
            if (i<=9) {
                diaRendimento += "0" + i + "/2022";
            } else {
                diaRendimento += i + "/2022";
            }
            System.out.println("Na data de " + diaRendimento + " o seu saldo é de R$ "+ this.getSaldo());
            diaRendimento = "10/";
        }
        return this.getSaldo();
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaRendimento='" + "10 de cada mês" + '\'' +
                '}';
    }
}
