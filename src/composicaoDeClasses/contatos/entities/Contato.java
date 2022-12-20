package composicaoDeClasses.contatos.entities;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone telefone;

    public Contato() {
    }

    public Contato(String nome, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: "
                + nome
                + " | Endereço: "
                + endereco
                + " | Telefone: "
                + telefone;
    }
}
