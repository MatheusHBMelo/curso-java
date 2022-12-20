package composicaoDeClasses.contatos;

import composicaoDeClasses.contatos.entities.Contato;
import composicaoDeClasses.contatos.entities.Endereco;
import composicaoDeClasses.contatos.entities.Telefone;
import composicaoDeClasses.contatos.enums.TipoTelefone;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo contato
        Contato contato = new Contato();

        // Instanciando um objeto do tipo endereco
        Endereco endereco = new Endereco();

        // Instanciando a lista de telefone
        List<Telefone> telefones = new ArrayList<>();

        // Instanciando dois objetos do tipo telefone
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();

        // Atribuindo valores aos atributos pelos métodos setters
        contato.setNome("Matheus Henrique");
        endereco.setRua("Rua do leste");
        endereco.setNumero(50);
        endereco.setComplemento("Edificio das palmeiras");
        endereco.setBairro("Recife antigo");
        endereco.setCidade("Recife");
        endereco.setCep("00000-000");
        telefone.setTipo(TipoTelefone.valueOf("CELULAR"));
        telefone.setDdd("81");
        telefone.setNumero("99999-0000");
        telefone2.setTipo(TipoTelefone.valueOf("FAX"));
        telefone2.setDdd("81");
        telefone2.setNumero("999-999-0000");

        // Atribuindo os dois telefones na lista de telefones
        telefones.add(telefone);
        telefones.add(telefone2);

        // Atribuindo o endereco ao contato
        contato.setEndereco(endereco);

        // Atribuindo o telefone ao contato
        contato.setTelefones(telefones);

        // Imprimindo os valores dos atributos pelos métodos getters
        System.out.println("Nome: " + contato.getNome());
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco());
        }
        if (contato != null && contato.getTelefones() != null) {
            System.out.println(contato.getTelefones());
        }

        // Testando o método toString()
        System.out.println("\n" + contato);
    }
}
