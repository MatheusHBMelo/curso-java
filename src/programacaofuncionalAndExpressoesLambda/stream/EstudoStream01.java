package programacaofuncionalAndExpressoesLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EstudoStream01 {
    public static void main(String[] args) {
        // 01 - Usando o método .stream()
        List<Integer> list = Arrays.asList(10, 13, 14, 21);
        Stream<Integer> st01 = list.stream();
        System.out.println(Arrays.toString(st01.toArray()));

        System.out.println("-------------------------------");

        // 02 - Usando o método .stream.of()
        Stream<String> st02 = Stream.of("Leticia, Davi, Luiza, Eduarda, Matheus");
        System.out.println(Arrays.toString(st02.toArray()));

        System.out.println("-------------------------------");

        // 03 - Usando o método .stream.iterate(x, y) - X é o primeiro valor, y é a função para acrescentar elementos
        Stream<Integer> st03 = Stream.iterate(0, x -> x + 1); // Mumero anterior + 1 {0, 1, 2..}
        System.out.println(Arrays.toString(st03.limit(11).toArray()));

        System.out.println("-------------------------------");

        // 04 - Exemplo com a sequência de Fibonnaci
        Stream<Long> st04 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st04.limit(10).toArray()));
    }
}
