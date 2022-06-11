package Aulas.Aula41.Animal;

import java.util.Locale;
import java.util.Scanner;

public class Cachorro extends Mamifero{

    private String tamanho;
    private String raca;

    Scanner scan = new Scanner(System.in);

    public Cachorro() {
        super();
    }

    public String amamentar() {
        return null;
    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public String emitirSom() {
        String som = "Au au!";
        return som;
    }


    public String amamentar(String nome) {

        Boolean pode = verificarSeAmamenta(nome);
        String amamentar = "\n";

        if (pode == true) {
            amamentar += "A Cadela " + nome + ": Deu de mamar ao seu filhote";
        }else{
            amamentar += nome+ " "+ "Não pode amamentar";
        }

        return amamentar;
    }

    public Boolean verificarSeAmamenta (String nome){

        System.out.println(nome + " é macho ou fêmea [M ou F]");
        String resposta = scan.nextLine();

        if (resposta != null && resposta.equalsIgnoreCase("F")){
            return true;
        } else {
            return false;
        }
    }
}
