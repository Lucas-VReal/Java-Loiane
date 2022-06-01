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
                System.out.println("O nome deve ter pelo menos 3 dígitos");
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
                System.out.println("Idade não aceita! Digite novamente!");
            } else {
                v++;
            }
        } while (v<1);

       System.out.println("");
        v = 0;
        do{
            System.out.print("Digite o seu salário: ");
            payment = scan.nextDouble();
            if (payment <= 0){
                System.out.println("Salário Inválido! Digite novamente!");
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
                System.out.println("Sexo inválido! Use M para Masculino ou F para feminino");
                System.out.println("Deve possuir somente 1 letra M ou F");
            } else {
                System.out.println("Sexo inválido! Use M para Masculino ou F para feminino");
            }
        } while (v<1);
       v= 0;
        System.out.println("");

        do{
            System.out.print("Digite o seu estado civil [s, c, v ,d]: ");
            varoagem = scan.next();
            int tamanho = varoagem.length();

            if (tamanho > 1){
                if (varoagem.equalsIgnoreCase("solteiro") | varoagem.equalsIgnoreCase("casado") | varoagem.equalsIgnoreCase("viúvo") | varoagem.equalsIgnoreCase("divorciado") | varoagem.equalsIgnoreCase("desquitado")) {
                    v++;
                } else  if (varoagem.equalsIgnoreCase("solteira") | varoagem.equalsIgnoreCase("casada") | varoagem.equalsIgnoreCase("viúva") | varoagem.equalsIgnoreCase("divorciada") | varoagem.equalsIgnoreCase("desquitada")) {
                    v++;
                } else {
                    System.out.println("utilize somente letras minúsculas");
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
                    varoagem = "Viúvo(a)";
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
        System.out.println("Se nome é "+ nome + ", você têm "+ age + " anos, seu salário é de R$ "+ payment + " reais, você é do sexo "+ Sex + " e seu estado civil é "+ varoagem);
    }
}
