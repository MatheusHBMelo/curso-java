package programacaofuncionalAndExpressoesLambda.comparator.application;

import programacaofuncionalAndExpressoesLambda.comparator.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Instanciando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Adicionando produtos na lista
        list.add(new Product("Notebook", 2500.00));
        list.add(new Product("Bola", 50.00));
        list.add(new Product("Teclado", 100.00));
        list.add(new Product("Arco", 10.00));
        list.add(new Product("Computador", 3500.00));

        // Collections.sort(list); -> É necessário ter um comparable e implementar o compareTo
        // list.sort(new ProductComparator()); -> É necessário ter um Comparator e passar via argumento

        /* Estrutura e declaração de uma classe anonima

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }
        };

        */

        // list.sort(comp); -> Comparator da classe anonima é passado como argumento

        // Metodo anonimo
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        // list.sort(comp);

        // Metodo anonimo reduzido
        Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        // list.sort(comp2);

        // Função anonima passada por argumento - Arrow Function
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
