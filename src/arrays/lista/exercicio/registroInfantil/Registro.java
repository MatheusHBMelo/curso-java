package arrays.lista.exercicio.registroInfantil;

public class Registro {
    private Integer rg;
    private String nome;
    private Integer idade;

    public Registro() {
    }

    public Registro(Integer rg, String nome, Integer idade) {
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String toString(){
        return "RG: "
                + rg
                + ", "
                + nome
                + ", "
                + idade
                +" anos.";
    }
}
