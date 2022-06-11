package Aulas.Aula44;

public class Teste {
    public static void main(String[] args) {

        Mamifero toto = new Cachorro();

        Mamifero gatinho = new Gato();

        Ave passarinho = new Papagaio();

        toto.setNome("Thor");
        gatinho.setNome("Napoleão");
        passarinho.setNome("Pica Pau");

        String nome= toto.getNome();

        System.out.println(toto.getNome() + ": " +  toto.emitirSom());
        System.out.println(toto.amamentar(nome));
        System.out.println(" ");

        nome = gatinho.getNome();
        System.out.println(gatinho.getNome() + ": " +  gatinho.emitirSom());
        System.out.println(gatinho.amamentar(nome));
        System.out.println(" ");

        System.out.println(passarinho.getNome() + ": " + passarinho.voar());
        System.out.println(passarinho.emitirSom());




    }
}
