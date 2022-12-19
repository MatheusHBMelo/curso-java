package exercicios_java.classes;

public class Carro {
    private String nome;
    private double peso;
    private String fabricante;
    private String cor;
    private double valorCarro;

    public Carro(String nome, double peso, String fabricante, String cor, double valorCarro) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valorCarro = valorCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    // Metodos
    public void darDesconto(double valor){
        this.valorCarro -= valor;
    }

    public void pintar(String cor){
        this.cor = cor;
    }
}
