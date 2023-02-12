public abstract class Mamifero extends Animal {
    private String raca;

    public Mamifero(){
        super();
    }

    public Mamifero(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String amamentar(){
        return "Animal sendo amamentado";
    }
}
