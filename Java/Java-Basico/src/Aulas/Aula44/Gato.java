package Aulas.Aula44;

import java.util.Scanner;

public class Gato extends Mamifero  implements AnimalDomesticado, AnimalEstimacao{

    private String raca;

    Scanner scan = new Scanner(System.in);

    public Gato() {
        super();
    }


    public String amamentar() {
        return null;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Gato(String nome) {
        super(nome);
    }

    public String emitirSom() {
        String som = "Miuau";
        return som;
    }


    public String amamentar(String nome) {
        Boolean pode = verificarSeAmamenta(nome);
        String amamentar = "\n";
        if (pode == true) {
            amamentar += "Gatinha " + nome + ": Deu de mamar ao seu filhote";
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

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void Brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
