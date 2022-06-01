package Exercicios.Aulas28a33;

public class ExContaCorrente {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia("0021");
        cc.setNumConta("0-00589");
        cc.setSaldo(1500);
        cc.setEspecial(true);
        cc.setLimiteEspecial(0.05);

        cc.mostrarSaldo();
        System.out.println("");

        cc.realizarSaque(500);
        System.out.println("");

        cc.realizarDeposito(100);

        cc.mostrarSaldo();
        System.out.println("");

        cc.verificarCrot();


    }
}
