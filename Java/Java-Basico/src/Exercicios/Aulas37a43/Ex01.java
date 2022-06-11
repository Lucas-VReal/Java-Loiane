package Exercicios.Aulas37a43;

public class Ex01 {
    public static void main(String[] args) {

        ContaBancaria poupanca = new ContaPoupanca();

        ContaBancaria contaEspecial = new ContaEspecial();

        poupanca.depositar(1000);
        System.out.println();

        contaEspecial.depositar(2000);
        System.out.println();

        poupanca.sacar(200);
        System.out.println();

        contaEspecial.sacar(350);
        System.out.println();

        poupanca.calcularNovoSaldo();
        System.out.println();

        poupanca.setNumConta("000599-7");
        poupanca.setNomeCliente("Lucas Real");

        System.out.println(poupanca);




    }
}
