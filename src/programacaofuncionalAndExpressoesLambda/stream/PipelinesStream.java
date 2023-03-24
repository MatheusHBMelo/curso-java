package programacaofuncionalAndExpressoesLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipelinesStream {
    public static void main(String[] args) {
        // Criando uma lista fixa de inteiros para realizar os testes
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Default: " + list);

        // PIPELINE 01 - Multiplicando todos os elementos por 10
        Stream<Integer> st01 = list.stream().map(x -> x * 10);
        System.out.println("X10: " + Arrays.toString(st01.toArray()));

        // PIPELINE 02 - Somandos todos os elementos
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Soma: " + sum);

        // PIPELINE 03 - Multiplicando todos os elementos
        int multi = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Multiplicação: " + multi);

        // PIPELINE 04 - Filtrando apenas os números pares
        List<Integer> pares = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println("Pares: " + Arrays.toString(pares.toArray()));

        // PIPELINE 05 - Filtrando apenas os números impares
        List<Integer> impares = list.stream()
                .filter(x -> x % 2 != 0)
                .toList();
        System.out.println("Impares: " + Arrays.toString(impares.toArray()));

        // PIPELINE 06 - Filtrando apenas os números maiores que 5
        List<Integer> maiorCinco = list.stream()
                .filter(x -> x > 5)
                .toList();
        System.out.println("Maiores que 5: " + Arrays.toString(maiorCinco.toArray()));

        // PIPELINE 07 - Filtrando apenas os números menores que 5
        List<Integer> menorCinco = list.stream()
                .filter(x -> x < 5)
                .toList();
        System.out.println("Menores que 5: " + Arrays.toString(menorCinco.toArray()));

        // PIPELINE 08 - Filtrando apenas os números primos
        List<Integer> primos = list.stream()
                .filter(PipelinesStream::isPrime)
                .toList();
        System.out.println("Primos: " + Arrays.toString(primos.toArray()));
    }
    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
