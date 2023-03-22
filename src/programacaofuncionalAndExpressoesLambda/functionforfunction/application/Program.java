package programacaofuncionalAndExpressoesLambda.functionforfunction.application;

import programacaofuncionalAndExpressoesLambda.functionforfunction.model.Product;
import programacaofuncionalAndExpressoesLambda.functionforfunction.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa que, a partir de uma lista de produtos, calcule a
        soma dos preços somente dos produtos cujo nome começa com "T".
         */

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filtraSoma(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Soma: R$" + String.format("%.2f", sum));
    }
}
