package collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class EstudoNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Funcionario> num = new TreeSet<>();
        num.add(new Funcionario(10L, "Matheus", 1000.00));
        num.add(new Funcionario(5L, "Carlos", 1600.00));
        num.add(new Funcionario(1L, "Gilberto", 500.00));
        num.add(new Funcionario(7L, "Robert", 1200.00));
        num.add(new Funcionario(2L, "Davi", 1300.00));
        num.add(new Funcionario(4L, "Tyler", 800.00));
        num.add(new Funcionario(8L, "Davies", 3000.00));
        num.add(new Funcionario(12L, "Will", 1900.00));
        num.add(new Funcionario(3L, "Mark", 2300.00));

        // O comparable está ordenando por ID, tal como Equals and Hashcode
        for (Funcionario f: num) {
            System.out.println(f);
        }

        Funcionario f2 = new Funcionario(6L, "Max", 700.00);

        System.out.println("\nFirst: " +num.first());
        System.out.println("\nLast: " +num.last());
        System.out.println("\nLower: " +num.lower(f2));
        System.out.println("\nHigher: " +num.higher(f2));
        System.out.println("\nFloor: " +num.floor(f2));
        System.out.println("\nCeiling: " +num.ceiling(f2));
        System.out.println("\nPollFirst: " +num.pollFirst());
        System.out.println("\nPollLast: " +num.pollLast());
    }
}
