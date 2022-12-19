package exercicios_java.classes;

public class Elevador {
    private int andar;
    private final int totalAndar = 5;
    private final int capacidade = 10;
    private int quantidade;

    public Elevador(){
        this.andar = 0;
        this.quantidade = 0;
    }
    public Elevador(int andar, int quantidade) {
        this.andar = andar;
        this.quantidade = quantidade;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Metodos
    public void entra(int valor){
        if (quantidade >= capacidade){
            System.out.println("Elevador cheio");
        } else if ((quantidade + valor) > capacidade) {
            System.out.println("ERRO: A quantidade ultrapassará o limite! - Elevador Cheio");
            quantidade = 10;
        } else {
            quantidade += valor;
        }
    }

    public void sai(int valor){
        if (quantidade <= 0){
            System.out.println("O elevador já está vazio!");
        } else if ((quantidade - valor) < 0){
            System.out.println("A quantidade de pessoas não pode ser negativa!");
            quantidade = 0;
        } else {
            quantidade -= valor;
        }
    }

    public void sobe(int qtd){
        if (andar == totalAndar){
            System.out.println("Elevador já está no andar limite!");
        } else if ((andar + qtd) > totalAndar){
            System.out.println("O andar limite é o " + totalAndar);
            andar = totalAndar;
        } else {
            andar += qtd;
        }
    }

    public void desce(int qtd){
        if (andar == 0){
            System.out.println("Elevador já está no andar minimo!");
        } else if ((andar - qtd) < 0){
            System.out.println("O andar minimo é o 0");
            andar = 0;
        } else {
            andar -= qtd;
        }
    }

    public String toString(){
        return "Andar: "
                + andar
                + " - Pessoas: "
                + quantidade;
    }
}
