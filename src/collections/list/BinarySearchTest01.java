package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            numeros.add(i);
        }

        // Antes de fazer o Binary Search é encessário ordenar a lista
        Collections.sort(numeros);

        // É necessário passar a lista e o elementos que deseja ser buscado
        System.out.println(Collections.binarySearch(numeros, 100));

        List<Comparable01> cc = new ArrayList<>();
        cc.add(new Comparable01(11111L, "Afg", 25.00));
        cc.add(new Comparable01(66666L, "Ang", 15.00));
        cc.add(new Comparable01(44444L, "Mat", 5.00));
        cc.add(new Comparable01(33333L, "Dav", 35.00));
        cc.add(new Comparable01(22222L, "Abc", 45.00));
        cc.add(new Comparable01(88888L, "Rex", 105.00));

        System.out.println("\n Sem ordenação");
        for (Comparable01 ccc : cc){
            System.out.println(ccc);
        }

        cc.sort(new Comparator01());

        System.out.println("\nCom ordenação por ID do comparator");
        for (Comparable01 ccc : cc){
            System.out.println(ccc);
        }

        System.out.println("\nRealizando busca binaria");
        Comparable01 comp = new Comparable01(44444L, "Mat", 5.00);

        // É necessário passar como argumento a lista, o elementos a ser procurado e o comparator
        System.out.println(Collections.binarySearch(cc, comp, new Comparator01()));
    }
}
