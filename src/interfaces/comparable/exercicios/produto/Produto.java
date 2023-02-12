package interfaces.comparable.exercicios.produto;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Valor: " + valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return nome.equals(produto.nome) && valor.equals(produto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }

    @Override
    public int compareTo(Produto o) {
        /* COMPARA POR NOME
        if(o == null){
            return 1;
        }
        int comparacao = 0;
        if(nome != null) {
            comparacao = this.nome.compareTo(o.nome);
        }
        return  comparacao;
        */
        // COMPARA POR VALOR
        int comparacao = 0;
        if (valor == null){
            return 1;
        } else if (valor != null){
            comparacao = this.valor.compareTo(o.valor);
        }
        return  comparacao;
    }
}
