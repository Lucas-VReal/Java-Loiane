package Exercicios.Aulas16a17;

import java.util.Scanner;

public class Validacoes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age, v = 0;
        String nome, sex, Sex, varoagem= "";
        double payment = 0;

        do{
            System.out.print("Digite o seu nome: ");
            nome = scan.next();
            int tamanho = nome.length();
            if (tamanho <= 3){
                System.out.println("O nome deve ter pelo menos 3 d�gitos");
            } else {
                v++;
            }
        } while (v<1);

      System.out.println("");
        v = 0;

        do{
            System.out.print("Digite a sua idade: ");
            age = scan.nextInt();
            if (age < 0 | age > 150 ){
                System.out.println("Idade n�o aceita! Digite novamente!");
            } else {
                v++;
            }
        } while (v<1);

       System.out.println("");
        v = 0;
        do{
            System.out.print("Digite o seu sal�rio: ");
            payment = scan.nextDouble();
            if (payment <= 0){
                System.out.println("Sal�rio Inv�lido! Digite novamente!");
            } else {
                v++;
            }
        } while (v<1);

        System.out.println("");
        v = 0;
        do{
            System.out.print("Digite o sexo [M ou F]: ");
            sex = scan.next();
            Sex = sex;
            int tamanho = sex.length();
            if (sex.equals("M") | sex.equals("F")){
                switch (sex) {
                    case "M":
                        Sex = "Masculino";break;
                    case "F":
                        Sex = "Feminino";break;
                }
                v++;
            } else if (tamanho > 1){
                System.out.println("Sexo inv�lido! Use M para Masculino ou F para feminino");
                System.out.println("Deve possuir somente 1 letra M ou F");
            } else {
                System.out.println("Sexo inv�lido! Use M para Masculino ou F para feminino");
            }
        } while (v<1);
       v= 0;
        System.out.println("");

        do{
            System.out.print("Digite o seu estado civil [s, c, v ,d]: ");
            varoagem = scan.next();
            int tamanho = varoagem.length();

            if (tamanho > 1){
                if (varoagem.equalsIgnoreCase("solteiro") | varoagem.equalsIgnoreCase("casado") | varoagem.equalsIgnoreCase("vi�vo") | varoagem.equalsIgnoreCase("divorciado") | varoagem.equalsIgnoreCase("desquitado")) {
                    v++;
                } else  if (varoagem.equalsIgnoreCase("solteira") | varoagem.equalsIgnoreCase("casada") | varoagem.equalsIgnoreCase("vi�va") | varoagem.equalsIgnoreCase("divorciada") | varoagem.equalsIgnoreCase("desquitada")) {
                    v++;
                } else {
                    System.out.println("utilize somente letras min�sculas");
                    System.out.println("s para solteiro, c para casado, v para viuvo ou d para divorciado");
                }
            } else {
            switch (varoagem) {
                case "s":
                    varoagem = "Solteiro(a)";
                    v++;break;
                case "c":
                    varoagem = "Casado(a)";
                    v++;break;
                case "v":
                    varoagem = "Vi�vo(a)";
                    v++;break;
                case "d":
                    varoagem = "Divorciado(a) ou Desquitado(a)";
                    v++;break;
                default:
                    System.out.println("Erro: s para solteiro, c para casado, v para viuvo ou d para divorciado");break;
            }
            }
        } while (v<1);

        System.out.println("");
        System.out.println("");
        System.out.println("Se nome � "+ nome + ", voc� t�m "+ age + " anos, seu sal�rio � de R$ "+ payment + " reais, voc� � do sexo "+ Sex + " e seu estado civil � "+ varoagem);
    }
}
