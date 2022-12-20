package composicaoDeClasses.contatos;

import composicaoDeClasses.contatos.entities.Contato;

public class App {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo contato
        Contato contato = new Contato();

        // Atribuindo valores aos atributos pelos métodos setters
        contato.setNome("Matheus Henrique");
        contato.setEndereco("Recife, PE - Brasil");
        contato.setTelefone("81 99999-0000");

        // Imprimindo os valores dos atributos pelos métodos getters
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Endereço: " + contato.getEndereco());
        System.out.println("Telefone: " + contato.getTelefone());
    }
}
