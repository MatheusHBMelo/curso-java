package programacaofuncionalAndExpressoesLambda.predicate.program;

import programacaofuncionalAndExpressoesLambda.predicate.entities.Product;
import programacaofuncionalAndExpressoesLambda.predicate.entities.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        // Removendo com expressão lambda simples
        products.removeIf(p -> p.getPrice() >= 100.00);

        // Implementando a interface predicate
        products.removeIf(new ProductPredicate());

        // Reference method com método estático
        products.removeIf(Product::staticProductPredicate);

        // Reference method com método não estático
        products.removeIf(Product::nonStaticProductPredicate);

        // Expressão lambda declarada
        double min = 100.00;
        Predicate<Product> prod = p -> p.getPrice() >= min;
        products.removeIf(prod);

        // Expressão lambda inline
        products.removeIf(p -> p.getPrice() >= min);

        for (Product p : products){
            System.out.println(p);
        }
    }
}
