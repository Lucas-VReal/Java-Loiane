package Exercicios.Aula19;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Resources {
    private int [] vetorA;
    private int [] vetorB;
    private int posicao = 0;
    private double [] vetordoubleB;

    Scanner scan = new Scanner(System.in);

    public double[] getVetordoubleB() {
        return vetordoubleB;
    }

    public void setVetordoubleB(int x) {
        this.vetordoubleB = new double [x];
    }

    public int[] getVetorA() {
        return vetorA;
    }

    public void setVetorA(int i) {
        this.vetorA  = new int[i];
    }

    public int[] getVetorB() {
        return vetorB;
    }

    public void setVetorB(int i) {
        this.vetorB = new int[i];
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void menu (String i){
        System.out.println("______________________________");
        System.out.println("                              ");
        System.out.println(i);
        System.out.println("                              ");
        System.out.println("______________________________");
    }

    public void definirAigualB() {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++) {
            posicao++;
            System.out.println("Digite o " + posicao + "° valor: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores informados são: ");
        System.out.println("");
        for (int i = 0; i < vetorB.length; i++) {
            posicao++;
            System.out.println(posicao + "°_ " + vetorB[i]);
        }
    }

        public void definirBdobrodeA() {
            posicao = 0;
            System.out.println("");
            for (int i = 0; i < vetorA.length; i++) {
                posicao++;
                System.out.println("Digite o " + posicao + "° valor: ");
                vetorA[i] = scan.nextInt();
                vetorB[i] = 2 * vetorA[i];
            }
            System.out.println();
            posicao = 0;
            System.out.println("O dobro dos valores de A são: ");
            System.out.println("");
            for (int i = 0; i < vetorB.length; i++) {
                posicao++;
                System.out.println(posicao + "°_ " + vetorB[i]);
            }
        }

            public void definirBquadradodeA() {
                posicao = 0;
                System.out.println("");
                for (int i = 0; i < vetorA.length; i++){
                    posicao++;
                    System.out.println("Digite o "+ posicao + "° valor: ");
                    vetorA [i] = scan.nextInt();
                    vetorB [i] = vetorA[i] * vetorA [i];
                }
                System.out.println();
                posicao = 0;
                System.out.println("Os valores de A ao quadrado são: ");
                System.out.println("");
                for (int i = 0; i < vetorB.length; i++){
                    posicao++;
                    System.out.println(posicao+"°_ "+ vetorB[i]);
                }

            }

    public void definirBraizdeA() {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++){
            posicao++;
            System.out.println("Digite o "+ posicao + "° valor: ");
            vetorA [i] = scan.nextInt();
            vetordoubleB [i] = sqrt(vetorA[i]);
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de raiz quadrada são: ");
        System.out.println("");
        for (int i = 0; i < vetordoubleB.length; i++){
            posicao++;
            System.out.println(posicao+"°_ "+ vetordoubleB[i]);
        }

    }

    public void definirBposicaodeA() {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++){
            posicao++;
            System.out.println("Digite o "+ posicao + "° valor: ");
            vetorA [i] = scan.nextInt();
            vetorB [i] = vetorA [i] * posicao;
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de A*posição são: ");
        System.out.println("");
        for (int i = 0; i < vetorB.length; i++){
            posicao++;
            System.out.println(posicao+"°_ "+ vetorB[i]);
        }

    }

    public void somarAmaisB(int[] x) {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++) {
            posicao++;
            System.out.println("Digite o " + posicao + "° valor de A: ");
            vetorA[i] = scan.nextInt();

            System.out.println("Digite o " + posicao + "° valor de B: ");
            vetorB[i] = scan.nextInt();
            System.out.println("");

            x[i] = vetorA[i] + vetorB[i];
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de C são: ");
        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            posicao++;
            System.out.println(posicao + "°_ " + x[i]);
        }
    }

        public void subtrairAmenosB(int[] x) {
            posicao = 0;
            System.out.println("");
            for (int i = 0; i < vetorA.length; i++) {
                posicao++;
                System.out.println("Digite o " + posicao + "° valor de A: ");
                vetorA[i] = scan.nextInt();

                System.out.println("Digite o " + posicao + "° valor de B: ");
                vetorB[i] = scan.nextInt();
                System.out.println("");

                x[i] = vetorA[i] - vetorB[i];
            }
            System.out.println();
            posicao = 0;
            System.out.println("Os valores de C são: ");
            System.out.println("");
            for (int i = 0; i < x.length; i++) {
                posicao++;
                System.out.println(posicao + "°_ " + x[i]);
            }
    }
    public void multiplicarAvezesB(int[] x) {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++) {
            posicao++;
            System.out.println("Digite o " + posicao + "° valor de A: ");
            vetorA[i] = scan.nextInt();

            System.out.println("Digite o " + posicao + "° valor de B: ");
            vetorB[i] = scan.nextInt();
            System.out.println("");

            x[i] = vetorA[i] * vetorB[i];
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de C são: ");
        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            posicao++;
            System.out.println(posicao + "°_ " + x[i]);
        }
    }

    public void dividirAporB(int[] x) {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++) {
            posicao++;
            System.out.println("Digite o " + posicao + "° valor de A: ");
            vetorA[i] = scan.nextInt();

            System.out.println("Digite o " + posicao + "° valor de B: ");
            vetorB[i] = scan.nextInt();
            System.out.println("");

            x[i] = vetorA[i] / vetorB[i];
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de C são: ");
        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            posicao++;
            System.out.println(posicao + "°_ " + x[i]);
        }
    }

    public void restoDaDivisaoDeApor2() {
        posicao = 0;
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++) {
            posicao++;
            System.out.println("Digite o " + posicao + "° valor de A: ");
            vetorA[i] = scan.nextInt();
            System.out.println("");

            vetordoubleB[i] = vetorA[i] % 2;
        }
        System.out.println();
        posicao = 0;
        System.out.println("Os valores de B são: ");
        System.out.println("");
        for (int i = 0; i < vetordoubleB.length; i++) {
            posicao++;
            System.out.println(posicao + "°_ " + vetordoubleB[i]);
        }
    }



}
