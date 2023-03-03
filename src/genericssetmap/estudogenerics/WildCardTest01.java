package genericssetmap.estudogenerics;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consulta do cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consulta do gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animals = {new Cachorro(), new Gato()};

        printConsulta(animals);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
