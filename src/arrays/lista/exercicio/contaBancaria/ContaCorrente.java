package arrays.lista.exercicio.contaBancaria;

public class ContaCorrente {
    private Integer numero;
    private String titular;
    private Double saldo;

    public ContaCorrente(){}

    public ContaCorrente(Integer numero, String titular){
        this.numero = numero;
        this.titular = titular;
        depositar(0.0);
    }

    public ContaCorrente(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void depositar(Double valor){
        saldo += valor;
        System.out.println("Deposito feito com sucesso!");
    }

    public void sacar(Double valor){
        if (valor > saldo){
            System.out.println("\nSaldo insuficiente!");
        } else if (saldo == 0){
            System.out.println("\nEssa conta não possui saldo");
        }else {
            saldo -= valor;
            System.out.println("\nSaque feito com sucesso!");
        }
    }

    @Override
    public String toString(){
        return "Numero da conta: "
                + numero + " \t"
                + " | Titular da conta: "
                + titular + " \t"
                + " | Saldo: "
                + String.format("R$%.2f", saldo);
    }
}
