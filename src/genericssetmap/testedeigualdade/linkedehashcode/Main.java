package genericssetmap.testedeigualdade.linkedehashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        products.add(new Product("Notebook", 5000.00));
        products.add(new Product("Tv", 1000.00));
        products.add(new Product("Galaxy", 1500.00));
        products.add(new Product("Mesa", 500.00));

        Product prod = new Product("Notebook", 5000.00);

        // Sem Hashcode e Equals = false, pois é comparada a referência dos objetos.
        // Com Hashcode e Equals = true, pois são comparados os conteudos dos objetos.
        System.out.println("Contem: " + products.contains(prod));
    }
}
