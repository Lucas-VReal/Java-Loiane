package Exercicios.Aula24;

class Livro {
    String genero;
    String autor;
    String titulo;
    int paginas;
    int capitulos;
    double preco;
}

public class Livros {


    public static void main(String[] args) {

        Livro lv = new Livro();
        lv.genero = "Fic��o";
        lv.autor = "C.S Lewis";
        lv.titulo = "As Cr�nicas de N�rnia";
        lv.paginas = 120;
        lv.capitulos = 10;

        System.out.println("G�nero: "+ lv.genero);
        System.out.println("");
        System.out.println("Autor: "+ lv.autor);
        System.out.println("");
        System.out.println("T�tulo: "+ lv.titulo);
        System.out.println("");
        System.out.println("N�mero de P�ginas: "+ lv.paginas);
        System.out.println("");
        System.out.println("N�mero de Cap�tulos: "+ lv.capitulos);
        System.out.println("");

    }
}
