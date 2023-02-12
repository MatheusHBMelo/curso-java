package interfaces.comparator.estudante;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        if (o1.getIdade() == o2.getIdade()){
            return 0;
        }
        if (o1.getIdade() > o2.getIdade()){
            return 1;
        }
        if (o1.getIdade() < o2.getIdade()){
            return -1;
        }
        return 0;
    }
}
