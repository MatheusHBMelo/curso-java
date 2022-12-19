package exercicios_java.classes;

public class ContaCorrente {
    private int numeroDaConta;
    private String nome;
    private double saldo;

    public ContaCorrente(int numeroDaConta, String nome, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        depositar(0);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos
    public void sacar(double valor){
        this.saldo -= saldo;
    }

    public void depositar(double valor){
        this.saldo += saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente: "
                + numeroDaConta
                + " - "
                + nome
                + " - "
                + saldo;
    }
}
