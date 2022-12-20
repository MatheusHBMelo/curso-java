package composicaoDeClasses.contatos;

import composicaoDeClasses.contatos.entities.Contato;
import composicaoDeClasses.contatos.entities.Endereco;

public class App {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo contato
        Contato contato = new Contato();

        // Instanciando um objeto do tipo endereco
        Endereco endereco = new Endereco();

        // Atribuindo valores aos atributos pelos métodos setters
        contato.setNome("Matheus Henrique");
        contato.setTelefone("81 99999-0000");
        endereco.setRua("Rua do leste");
        endereco.setNumero(50);
        endereco.setComplemento("Edificio das palmeiras");
        endereco.setBairro("Recife antigo");
        endereco.setCidade("Recife");
        endereco.setCep("00000-000");

        // Atribuindo o endereco ao contato
        contato.setEndereco(endereco);

        // Imprimindo os valores dos atributos pelos métodos getters
        System.out.println("Nome: " + contato.getNome());
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco());
        }
        System.out.println("Telefone: " + contato.getTelefone());

        // Testando o método toString()
        System.out.println("\n" + contato);
    }
}
