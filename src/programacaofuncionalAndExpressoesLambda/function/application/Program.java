package programacaofuncionalAndExpressoesLambda.function.application;

import programacaofuncionalAndExpressoesLambda.function.entities.Product;
import programacaofuncionalAndExpressoesLambda.function.util.FunctionUpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);

        /* A partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta. */

        // Implementação da interface
        List<String> names = list.stream().map(new FunctionUpperCaseName()).toList();
        names.forEach(System.out::println);

        // Reference method com método estático
        List<String> names1 = list.stream().map(Product::staticSetUppercase).collect(Collectors.toList());
        names1.forEach(System.out::println);

        // Reference method com método não estático
        List<String> names2 = list.stream().map(Product::nonStaticSetUppercase).collect(Collectors.toList());
        names2.forEach(System.out::println);

        // Expressão lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names3 = list.stream().map(func).collect(Collectors.toList());
        names3.forEach(System.out::println);

        // Expressão lambda inline
        List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names4.forEach(System.out::println);
    }
}
