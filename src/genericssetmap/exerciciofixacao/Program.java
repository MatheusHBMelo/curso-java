package genericssetmap.exerciciofixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("\nHow many students for course A? ");
        int answerOne = sc.nextInt();
        for (int i = 1; i <= answerOne; i++) {
            System.out.print("ID student #" + i + ": ");
            A.add(sc.nextInt());
        }

        System.out.print("\nHow many students for course B? ");
        int answerTwo = sc.nextInt();
        for (int i = 1; i <= answerTwo; i++) {
            System.out.print("ID student #" + i + ": ");
            B.add(sc.nextInt());
        }

        System.out.print("\nHow many students for course C? ");
        int answerThree = sc.nextInt();
        for (int i = 1; i <= answerThree; i++) {
            System.out.print("ID student #" + i + ": ");
            C.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("\nTotal: " + total.size());

        sc.close();
    }
}
