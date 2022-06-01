package Exercicios.Aulas28a33;

public class ExAluno {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        al.setNome("Naruto");
        al.setCurso("Psicologia Ninja");
        al.setMatricula("00021");

        al.setDisciplina("Ninjtsu", "Taijutsu", "Genjtsu");
        al.setNota(8.5, 9.2,7.8);

        al.identificacaoDoAluno();
        System.out.println("");

        al.verificarseAprovado(al.getDisciplina());
    }
}
