package Exercicios.Aula24;

import java.text.DecimalFormat;

public class LivrosaVenda {
    public static void main(String[] args) {

        Livro LivrodeLivraria = new Livro();
        LivrodeLivraria.genero = "Teologia Filos�fica";
        LivrodeLivraria.autor = "G.K Chesterton";
        LivrodeLivraria.titulo = "O Homem Eterno";
        LivrodeLivraria.paginas = 180;
        LivrodeLivraria.capitulos = 15;
        LivrodeLivraria.preco = 38.70;
        String Pattern = "R$ ###,###.00";
        DecimalFormat df = new DecimalFormat(Pattern);

        System.out.println("G�nero: "+ LivrodeLivraria.genero);
        System.out.println("");
        System.out.println("Autor: "+ LivrodeLivraria.autor);
        System.out.println("");
        System.out.println("T�tulo: "+ LivrodeLivraria.titulo);
        System.out.println("");
        System.out.println("N�mero de P�ginas: "+ LivrodeLivraria.paginas);
        System.out.println("");
        System.out.println("N�mero de Cap�tulos: "+ LivrodeLivraria.capitulos);
        System.out.println("");
        System.out.println("Pre�o: "+ df.format(LivrodeLivraria.preco));
        System.out.println("");
    }
}
