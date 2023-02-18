package genericssetmap.testedeigualdade.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();

        products.add(new Product("Notebook", 5000.00));
        products.add(new Product("TV", 1000.00));
        products.add(new Product("Galaxy", 1300.00));
        products.add(new Product("Iphone", 2500.00));
        products.add(new Product("Mouse", 50.00));

        Product prod = new Product("Notebook", 5000.00);

        // É obrigatorio implementar a interface Comparable ou Comparator e sobrescrever o método compareTo
        System.out.println("Contem: " + products.contains(prod));
    }
}
