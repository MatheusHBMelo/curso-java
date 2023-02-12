public class App {
    public static void main(String[] args) throws Exception {
        Gato gatoOne = new Gato("James", "Amarelo");
        Cachorro dogOne = new Cachorro("Spike", "Golden", "Grande");

        // Testes com o gato
        System.out.println(gatoOne.amamentar());
        System.out.println(gatoOne.emitirSom());
        System.out.println(gatoOne.alimentar());
        System.out.println(gatoOne.brincar());
        System.out.println(gatoOne.levarPassear());
        System.out.println(gatoOne.levarVeterinario());

        // Testes com o cachorro
        System.out.println(dogOne.amamentar());
        System.out.println(dogOne.emitirSom());
        System.out.println(dogOne.brincar());
        System.out.println(dogOne.alimentar());
        System.out.println(dogOne.levarPassear());
        System.out.println(dogOne.levarVeterinario());
    }
}
