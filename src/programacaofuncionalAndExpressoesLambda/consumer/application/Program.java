package programacaofuncionalAndExpressoesLambda.consumer.application;

import programacaofuncionalAndExpressoesLambda.consumer.entities.Product;
import programacaofuncionalAndExpressoesLambda.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);

        /* Aumentar o preço dos produtos em 10% */

        // Implementação da interface
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);

        // Reference method com método estático
        list.forEach(Product::staticUpdatePrice);
        list.forEach(System.out::println);

        // Reference method com método não estático
        list.forEach(Product::nonStaticUpdatePrice);
        list.forEach(System.out::println);

        // Expressão lambda declarada
        double taxa = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * taxa);
        list.forEach(cons);
        list.forEach(System.out::println);

        // Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * taxa));
        list.forEach(System.out::println);
    }
}
