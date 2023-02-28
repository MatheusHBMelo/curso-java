package collections.list;

import java.util.Comparator;

public class Comparator01 implements Comparator<Comparable01> {

    @Override
    public int compare(Comparable01 o1, Comparable01 o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
