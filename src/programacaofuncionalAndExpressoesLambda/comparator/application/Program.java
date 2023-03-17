package programacaofuncionalAndExpressoesLambda.comparator.application;

import programacaofuncionalAndExpressoesLambda.comparator.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2500.00));
        list.add(new Product("Bola", 50.00));
        list.add(new Product("Teclado", 100.00));
        list.add(new Product("Arco", 10.00));
        list.add(new Product("Computador", 3500.00));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
