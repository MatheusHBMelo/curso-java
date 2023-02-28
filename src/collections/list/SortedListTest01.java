package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedListTest01 {
    public static void main(String[] args) {
        List<String> pilotos = new ArrayList<>();
        pilotos.add("Verstappen");
        pilotos.add("Hamilton");
        pilotos.add("Norris");
        pilotos.add("Russell");
        pilotos.add("Sainz");
        pilotos.add("Leclerc");
        pilotos.add("Tsunoda");
        pilotos.add("Alonso");
        pilotos.add("Gasly");

        System.out.println("Sem sorted: " + pilotos);
        Collections.sort(pilotos);
        System.out.println("Com sorted: " + pilotos);


        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(6);
        numeros.add(4);
        numeros.add(9);
        numeros.add(1);
        numeros.add(8);
        numeros.add(2);
        numeros.add(5);

        System.out.println("Sem sorted: " + numeros);
        Collections.sort(numeros);
        System.out.println("Com sorted: " + numeros);
    }
}
