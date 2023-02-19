package genericssetmap.map.estudo02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Product, String> stock = new HashMap<>();

        Product p1 = new Product("Notebook", 5300.00);
        Product p2 = new Product("Tv", 100.00);
        Product p3 = new Product("Galaxy", 1800.00);

        stock.put(p1, "Em estoque");
        stock.put(p2, "Em estoque");
        stock.put(p3, "Fora de estoque");

        Product ps = new Product("Notebook", 5300.00);

        // Necessário do Equal e HashCode na classe que será comparada
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

        // Iteração
        for (Product p : stock.keySet()) {
            System.out.println("Key: " + p + ", Value: " + stock.get(p));
        }
    }
}
