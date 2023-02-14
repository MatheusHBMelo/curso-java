package genericssetmap.genericosdelimitados.solucaoSimples.service;

import java.util.List;

public class CalculationService {
    // Estudar mais para fixar essa declaração <T extends Comparable<? super T>> T max(List<T> list)
    public static <T extends Comparable<? super T>> T max(List<T> list){
        if (list.isEmpty()){
            throw new IllegalStateException("A lista não pode ser vazia");
        }
        T max = list.get(0);
        for (T elemento : list){
            if (elemento.compareTo(max) > 0){
                max = elemento;
            }
        }
        return max;
    }
}
