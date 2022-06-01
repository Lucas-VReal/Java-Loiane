package Exercicios.Aula34;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {

    static int MPesQuadrados(int x) {
        double d = Double.valueOf(x);
        double y = d * 10.76;
        int y2 = Integer.valueOf((int) y);
        return y2;
    }

    static int CentimetrosQuadrados(int y) {
        int x = y * 929;
        return x;
    }

    static int Acres(int y) {
        int x = y * 640;
        return x;
    }

    static int APesQuadrados(int x) {
        int y = x * 43560;
        return y;
    }

    static void menu() {

        String UnidadeInicial;
        String UnidadeFinal;
        int f = 0;
        

        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println(" Menu de Conversões: ");
        System.out.println("Digite 1-> De Metros Quadrados para Pés Quadrados");
        System.out.println("Digite 2-> De Pés Quadrados para Centímetros Quadrados");
        System.out.println("Digite 3-> De Milhas Quadradas para Acres");
        System.out.println("Digite 4-> De Acres para Pés Quadrados");
        System.out.println("");
        int resposta = scan.nextInt();
        resposta = VerificarResposta(resposta);

        switch (resposta) {
            case 1: UnidadeInicial = " metros quadrados"; UnidadeFinal = " pés quadrados"; f =  MPesQuadrados(DefinirValor(UnidadeInicial, UnidadeFinal));System.out.println(f + UnidadeFinal);break;
            case 2: UnidadeInicial = " pés quadrados"; UnidadeFinal = " centimetros quadrados"; f =   CentimetrosQuadrados(DefinirValor(UnidadeInicial, UnidadeFinal));System.out.println(f + UnidadeFinal);break;
            case 3: UnidadeInicial = " milhas quadradas"; UnidadeFinal = " Acres"; f = Acres(DefinirValor(UnidadeInicial, UnidadeFinal));System.out.println(f + UnidadeFinal);break;
            case 4: UnidadeInicial = " Acres"; UnidadeFinal = " pés quadrados"; f = APesQuadrados(DefinirValor(UnidadeInicial, UnidadeFinal));System.out.println(f + UnidadeFinal);break;
        }
    }

    static int VerificarResposta(int resposta) {
        boolean erro = true;
        if (resposta > 0 | resposta < 5) {
        } else {
            System.out.println("Número Inválido");
            System.out.println("");
            while (!erro) {
                menu();
            }
        }
        return resposta;
    }

    static int DefinirValor (String ui, String uf){
        Scanner scan = new Scanner(System.in);
        System.out.println("Defina o valor incial em"+ ui + ": ");
        int v = scan.nextInt();
        System.out.print(v + ui + " para" + uf + ": ");
        return v;
}

}
