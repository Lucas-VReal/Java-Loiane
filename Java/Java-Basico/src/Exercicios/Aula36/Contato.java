package Exercicios.Aula36;

public class Contato {

    private String nome;
    private String telefone;
    private String e_mail;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String obterInfo (){
        return "Nome = " + this.nome + "; "+
                "Telefone = " + this.telefone + "; "+
                "E-mail = " + this.e_mail;
    }
}
