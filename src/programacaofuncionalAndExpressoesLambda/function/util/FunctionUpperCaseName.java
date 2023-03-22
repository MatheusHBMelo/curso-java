package programacaofuncionalAndExpressoesLambda.function.util;

import programacaofuncionalAndExpressoesLambda.function.entities.Product;

import java.util.function.Function;

public class FunctionUpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
