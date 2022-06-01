package Exercicios.Aula24;

public class ExercContatos {
    public static void main (String [] args) {

        Contatos contato1 = new Contatos();
        contato1.nome = "Lucas";
        contato1.endereço = "SMSE, Conjunto 10, Lote 15";

        contato1.telefones = new String[3];
        contato1.telefones [0] = "61984480152";
        contato1.telefones [1] = "61999000000";
        contato1.telefones [2] = "61335250000";


        System.out.println("Sr. "+ contato1.nome+ " Reside em " + contato1.endereço+ " possui o(s) seguinte(s) telefone(s): ");
        System.out.println(" ");

        for ( int i=0; i < contato1.telefones.length; i++) {
            System.out.println(contato1.telefones[i]);
        }


    }
}
