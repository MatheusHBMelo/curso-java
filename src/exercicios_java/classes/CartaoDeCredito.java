package exercicios_java.classes;

public class CartaoDeCredito {
    private double limite;
    private double saldoDaFatura;
    private String nomeCliente;

    public CartaoDeCredito() {
    }

    public CartaoDeCredito(double limite, String nomeCliente) {
        this.limite = limite;
        this.nomeCliente = nomeCliente;
        this.saldoDaFatura = 0.0;
    }

    public CartaoDeCredito(double limite, double saldoDaFatura, String nomeCliente) {
        this.limite = limite;
        this.saldoDaFatura = saldoDaFatura;
        this.nomeCliente = nomeCliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoDaFatura() {
        return saldoDaFatura;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    // Métodos
    public void aumentaLimite(double valor){
        System.out.println("Limite do cartão aumentado em " + String.format("R$%.2f", valor));
        this.limite += valor;
    }

    public void diminuiLimite(double valor){
        if (this.limite >= 0.0){
            System.out.println("Limite do cartão diminuido em " + String.format("R$%.2f", valor));
            this.limite -= valor;
        }
    }

    public void realizaCompra(double valor){
        if (saldoDaFatura == limite){
            System.out.println("COMPRA NÃO AUTORIZADA: O seu cartão já atingiu o limite máximo!");
        } else if ((saldoDaFatura + valor) > limite){
            System.out.println("COMPRA NÃO AUTORIZADA: Sem limite!");
        }else {
            System.out.println("COMPRA AUTORIZADA - Valor: " + String.format("R$%.2f", valor));
            saldoDaFatura += valor;
        }
    }

    public String imprimeFatura(){
        return String.format("Fatura total: R$%.2f", saldoDaFatura);
    }

    @Override
    public String toString() {
        return "Nome do cliente: "
                + nomeCliente
                + " - Limite de compra: "
                + String.format("R$%.2f", limite)
                + " - Saldo da fatura: "
                + String.format("R$%.2f", saldoDaFatura);
    }
}
