package Exercicios.Aulas28a33;

import java.text.DecimalFormat;

public class Lampada {

    //Atributos:

    private String tipo;
    private String estado;
    private int pot�ncia;
    private double preco;

    //Gets e Setts


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPot�ncia() {
        return pot�ncia;
    }

    public void setPot�ncia(int pot�ncia) {
        this.pot�ncia = pot�ncia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //M�todos

    public boolean dedao (String resposta){
        boolean on;
        switch (resposta){
            case "S": case "s": case "Sim": case "sim": on = true;break;
            default: on = false;break;
        }
        return on;
    }

    public String interruptor(boolean on){
        if (on == true) {
            estado = "Ligada";
            return estado;
        } else{
            estado = "Desligada";
            return estado;
        }
    }

    public String definirPreco (double valor){
        String Pattern = "R$ ###,##0.00#";
        DecimalFormat dc = new DecimalFormat(Pattern);
        String x = dc.format(valor);
        String y = ("O valor da l�mpada � de "+x);
        return y;
    }
}
