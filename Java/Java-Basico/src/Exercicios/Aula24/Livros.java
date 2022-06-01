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
        lv.genero = "Ficção";
        lv.autor = "C.S Lewis";
        lv.titulo = "As Crônicas de Nárnia";
        lv.paginas = 120;
        lv.capitulos = 10;

        System.out.println("Gênero: "+ lv.genero);
        System.out.println("");
        System.out.println("Autor: "+ lv.autor);
        System.out.println("");
        System.out.println("Título: "+ lv.titulo);
        System.out.println("");
        System.out.println("Número de Páginas: "+ lv.paginas);
        System.out.println("");
        System.out.println("Número de Capítulos: "+ lv.capitulos);
        System.out.println("");

    }
}
