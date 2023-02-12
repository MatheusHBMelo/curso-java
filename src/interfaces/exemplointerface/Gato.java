public class Gato extends Mamifero implements AnimalDeEstimacao, AnimalDomesticado {

    public Gato() {
        super();
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String amamentar() {
        return "O gato está amamentando!";
    }

    @Override
    public String emitirSom() {
        return "O gato está emitindo som!";
    }

    @Override
    public String alimentar() {
        return "O gato está se alimentando!";
    }

    @Override
    public String levarVeterinario() {
        return "O gato está no veterinario!";
    }

    @Override
    public String brincar() {
        return "O gato está bricando!";
    }

    @Override
    public String levarPassear() {
        return "O gato está passeando!";
    }
}
