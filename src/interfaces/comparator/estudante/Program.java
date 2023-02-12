package interfaces.comparator.estudante;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Estudante> list = new ArrayList<>();

        Estudante e1 = new Estudante("Carl Jonson", 30);
        Estudante e2 = new Estudante("Maicon Fred", 23);
        Estudante e3 = new Estudante("EiJey Frank", 18);
        Estudante e4 = new Estudante("Elliot Fran", 20);
        Estudante e5 = new Estudante("Henry Garry", 16);
        Estudante e6 = new Estudante("Robert Toff", 40);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        System.out.println("SEM ORDENAÇÃO:");
        for(Estudante e: list){
            System.out.println(e);
        }

        System.out.println("\n--------------------\n");

        Collections.sort(list, new IdadeComparator());

        System.out.println("ORDENAÇÃO POR IDADE:");
        for(Estudante e: list){
            System.out.println(e);
        }

        Collections.sort(list, new NomeComparator());

        System.out.println("\nORDENAÇÃO POR NOME:");
        for(Estudante e: list){
            System.out.println(e);
        }

    }
}
