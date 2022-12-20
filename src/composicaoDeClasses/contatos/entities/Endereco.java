package composicaoDeClasses.contatos.entities;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco() {
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "{ " +
                "Rua: "
                + rua
                + " | Número: "
                + numero
                + " | Complemento: "
                + complemento
                + " | Bairro: "
                + bairro
                + " | Cidade: "
                + cidade
                + " | CEP: "
                + cep
                + " }";
    }
}
