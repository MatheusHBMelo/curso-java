package collections.set;

import java.util.Objects;

public class Funcionario implements Comparable<Funcionario> {
    private Long id;
    private String nome;
    private double salary;

    public Funcionario(Long id, String nome, double salary) {
        Objects.requireNonNull(id, "O ID é um atributo obrigatorio!");
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Funcionario o) {
        return this.id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "ID: " + id + " - NOME: " + nome + " - SALARIO: " + salary;
    }
}
