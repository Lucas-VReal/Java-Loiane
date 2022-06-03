package Aulas.Aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyryon");
        // contato.setEndereco("Kings Landing");
        //contato.setTelefone();

        // Relacionamento tem-um-endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("999999");

        // Relacionamento tem-um-telefone2
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("9999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular");
        telefone2.setDdd("11");
        telefone2.setNumero("8888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefones(telefone2);
        contato.setTelefones(telefones);
        contato.setEndereco(end);

        if (contato != null) {

            System.out.println(contato.getNome());

            /*if (contato.getTelefones() != null) {
                    System.out.println(contato.getTelefones().getDDD + " " + contato.getTelefones().getNumero());

            }*/

            if (contato.getTelefones() != null){
                for (Telefone t : contato.getTelefones()){
                    System.out.println(t.getDdd() + " " + t.getNumero());
                }
            }

            if (contato.getEndereco() != null) {
                System.out.println(contato.getEndereco().getCidade());
            }
        }
    }

}
