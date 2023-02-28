package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest01 {
    public static void main(String[] args) {
        List<Comparable01> cc = new ArrayList<>();
        cc.add(new Comparable01(11111L, "Afg", 25.00));
        cc.add(new Comparable01(66666L, "Ang", 15.00));
        cc.add(new Comparable01(44444L, "Mat", 5.00));
        cc.add(new Comparable01(33333L, "Dav", 35.00));
        cc.add(new Comparable01(22222L, "Abc", 45.00));
        cc.add(new Comparable01(88888L, "Rex", 105.00));

        for (Comparable01 ccc : cc){
            System.out.println(ccc);
        }

        Collections.sort(cc);

        System.out.println("\n Com ordenação Comparable:");
        for (Comparable01 ccc : cc){
            System.out.println(ccc);
        }

        System.out.println("\n Com ordenação Comparator:");
        Collections.sort(cc, new Comparator01());
        for (Comparable01 ccc : cc){
            System.out.println(ccc);
        }
    }
}
