package interfaces.comparable.exercicios.funcionario;

public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario o) {
        return this.nome.compareTo(o.getNome()); // Ordem crescente de nome
        // return -this.nome.compareTo(o.getNome()); // Ordem decrescente de nome
        // return this.salario.compareTo(o.getSalario()); // Ordem crescente de salario
        // return -this.salario.compareTo(o.getSalario()); // Ordem decrescente de salario
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: " + salario;
    }
}
