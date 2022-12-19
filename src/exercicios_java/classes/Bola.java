package exercicios_java.classes;

public class Bola {
    private double circunferencia;
    private String cor;
    private String marca;
    private double velocidade;

    public Bola(double circunferencia, String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String toString(){
        return "Marca: "
                + marca
                + " - Cor: "
                + cor
                + " - Circunferencia: "
                + circunferencia
                + " - Velocidade: "
                + velocidade;
    }
}
