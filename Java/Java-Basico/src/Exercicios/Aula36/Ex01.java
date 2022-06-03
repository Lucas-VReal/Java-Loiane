package Exercicios.Aula36;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda();
        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];

        for (int i=0; i < contatos.length; i++){
            System.out.println("Entre com o contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome do contato "  + (i+1));
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o Telefone do contato "  + (i+1));
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o endereço de e-mail do contato "  + (i+1));
            String email = scan.nextLine();
            c.setE_mail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

    }
}
