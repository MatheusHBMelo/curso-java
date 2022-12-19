package exercicios_java.classes.jogador;

public class Jogador {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;
    private int idade;

    public Jogador(){}
    public Jogador(String nome, String posicao, String nacionalidade, double altura, double peso, int idade){
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void tempoAposentar(){
        if (posicao.equals("Defesa")){
            if (idade == 40){
                System.out.println("O jogador estará se aposentando ao final da temporada");
            } else {
                int tempo = 40 - idade;
                System.out.println("Quantidade (anos) para aposentadoria: "+ tempo);
            }
        }

        if (posicao.equals("Meio campo")){
            if (idade == 38){
                System.out.println("O jogador estará se aposentando ao final da temporada");
            } else {
                int tempo = 38 - idade;
                System.out.println("Quantidade (anos) para aposentadoria: "+ tempo);
            }
        }

        if (posicao.equals("Atacante")){
            if (idade == 35){
                System.out.println("O jogador estará se aposentando ao final da temporada");
            } else {
                int tempo = 35 - idade;
                System.out.println("Quantidade (anos) para aposentadoria: "+ tempo);
            }
        }
    }

    public String toString(){
        return "Nome do jogador: "
                + nome
                + " | Idade do jogador: "
                + idade
                + " anos | Nacionalidade do jogador: "
                + nacionalidade
                + " | Posição do jogador: "
                + posicao
                + " | Altura do jogador: "
                + altura
                + "m | Peso do jogador: "
                + peso
                +"KG";
    }
}
