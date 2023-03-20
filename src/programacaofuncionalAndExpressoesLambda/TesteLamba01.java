package programacaofuncionalAndExpressoesLambda;

import java.util.Arrays;
import java.util.List;

public class TesteLamba01 {
    public static void main(String[] args) {

        // Lista de inteiros e atribuindo um array de valores
        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 1, 2);

        // Com expressão lambda
        numbers.forEach(number -> System.out.print(" - " + number + " - "));

        System.out.println(" ");

        // Com Method Reference
        numbers.forEach(System.out::print);
    }
}
