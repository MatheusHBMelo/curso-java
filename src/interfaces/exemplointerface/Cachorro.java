public class Cachorro extends Mamifero implements AnimalDeEstimacao, AnimalDomesticado{
    private String tamanho;
    
    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String raca, String tamanho) {
        super(nome, raca);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String amamentar(){
        return "O cachorro está amamentando!";
    }

    @Override
    public String emitirSom(){
        return "O cachorro está emitindo som!";
    }

    @Override
    public String brincar() {
        return "O cachorro está bricando!";
    }

    @Override
    public String levarPassear() {
        return "O cachorro está passeando!";
    }

    @Override
    public String alimentar() {
        return "O cachorro está sendo alimentado!";
    }

    @Override
    public String levarVeterinario() {
        return "O cachorro está no veterinario!";
    }
}
