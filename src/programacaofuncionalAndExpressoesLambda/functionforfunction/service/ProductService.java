package programacaofuncionalAndExpressoesLambda.functionforfunction.service;

import programacaofuncionalAndExpressoesLambda.functionforfunction.model.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filtraSoma(List<Product> list, Predicate<Product> criterio){
        double soma = 0.0;

        for (Product p : list){
            if (criterio.test(p)){
                soma += p.getPrice();
            }
        }

        return soma;
    }
}
