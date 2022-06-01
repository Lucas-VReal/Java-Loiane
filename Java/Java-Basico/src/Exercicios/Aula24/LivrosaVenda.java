package Exercicios.Aula24;

import java.text.DecimalFormat;

public class LivrosaVenda {
    public static void main(String[] args) {

        Livro LivrodeLivraria = new Livro();
        LivrodeLivraria.genero = "Teologia Filosófica";
        LivrodeLivraria.autor = "G.K Chesterton";
        LivrodeLivraria.titulo = "O Homem Eterno";
        LivrodeLivraria.paginas = 180;
        LivrodeLivraria.capitulos = 15;
        LivrodeLivraria.preco = 38.70;
        String Pattern = "R$ ###,###.00";
        DecimalFormat df = new DecimalFormat(Pattern);

        System.out.println("Gênero: "+ LivrodeLivraria.genero);
        System.out.println("");
        System.out.println("Autor: "+ LivrodeLivraria.autor);
        System.out.println("");
        System.out.println("Título: "+ LivrodeLivraria.titulo);
        System.out.println("");
        System.out.println("Número de Páginas: "+ LivrodeLivraria.paginas);
        System.out.println("");
        System.out.println("Número de Capítulos: "+ LivrodeLivraria.capitulos);
        System.out.println("");
        System.out.println("Preço: "+ df.format(LivrodeLivraria.preco));
        System.out.println("");
    }
}
