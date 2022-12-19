package ProgramacaoOrientadoObjeto.carro;

public class Car {
    public String marca;
    public String modelo;
    public int anoFabricacao;
    public String cor;
    public double valorAtual;
    public int velocidadeAtual;
    public final int velocidadeMaxima = 120;

    public final int velocidadeNeutra = 0;
    public boolean ligado = false;

    public void ligar(){
        if (!ligado){
            System.out.println("O condutor ligou o motor do veiculo!");
            ligado = true;
        }else {
            System.out.println("O motor do veiculo já está ligado!");
        }
    }

    public void desligar(){
        if (ligado){
            System.out.println("O condutor desligou o motor do veiculo!");
            ligado = false;
        } else {
            System.out.println("O veiculo já está desligado!");
        }
    }

    public void acelerar(int valor){
        if (ligado) {
            if (velocidadeAtual <= velocidadeMaxima) {
                if ((valor + velocidadeAtual) > velocidadeMaxima){
                    int temp = (valor + velocidadeAtual) - velocidadeMaxima;
                    valor -= temp;
                    velocidadeAtual += valor;
                    System.out.printf("Você não pode passar do limite de velocidade, acelerado: %dKM/H - Velocidade atual: %dKM/H%n", valor, velocidadeAtual);
                }else {
                    velocidadeAtual += valor;
                    System.out.printf("Você acelerou: %dKM/H - Velocidade atual: %dKM/H%n", valor, velocidadeAtual);
                }
            } else {
                System.out.println("Você já está na velocidade máxima do veiculo!");
            }
        } else {
            System.out.println("Não é possivel acelerar com o veiculo desligado!");
        }
    }

    public void freiar(int valor){
        if (ligado) {
            if (velocidadeAtual <= 0) {
                System.out.println("Você não pode freiar um veiculo que já está parado!");
            } else {
                if ((velocidadeAtual - valor) < velocidadeNeutra){
                    velocidadeAtual = 0;
                    System.out.printf("Você não pode ter velocidade negativa, Velocidade atual: %dKM/H%n", velocidadeAtual);
                }else {
                    velocidadeAtual -= valor;
                    System.out.printf("Você freiou: %dKM/H - Velocidade atual: %dKM/H%n", valor, velocidadeAtual);
                }
            }
        }else {
            System.out.println("Não é possivel freiar com o veiculo desligado!");
        }
    }

    public String toString(){
        return "MARCA: "
                + marca
                + " - MODELO: "
                + modelo
                + " - COR: "
                + cor
                + " - ANO DE FABRICACAO: "
                + anoFabricacao
                + " - VALOR ATUAL: "
                + String.format("%.2f", valorAtual);
    }
}
