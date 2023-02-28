package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Matheus");
        nomes.add("Davi");
        nomes.add("Jose");
        nomes.add("Henrique");
        nomes.add("Barbosa");
        nomes.add("Silva");
        nomes.add("Melo");

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("------------");

        nomes.remove(3);
        nomes.remove("Silva");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------");

        System.out.println(nomes.contains("Jose"));

        System.out.println(nomes.indexOf("Matheus"));

    }
}
