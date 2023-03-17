package programacaofuncionalAndExpressoesLambda.comparator.application;

import programacaofuncionalAndExpressoesLambda.comparator.model.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
