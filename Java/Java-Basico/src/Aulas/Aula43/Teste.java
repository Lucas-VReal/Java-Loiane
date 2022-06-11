package Aulas.Aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da Computação");
        double [] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);
        String s1 = "ahskjahskjahs";
        String s2 = "ahskjahskjahs";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciencia da Computação");
        double [] notas2 = {3, 9, 6, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));


    }
}
