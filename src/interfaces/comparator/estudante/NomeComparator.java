package interfaces.comparator.estudante;

import java.util.Comparator;

public class NomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
