package collections.list;

import java.util.*;

public class IteratorTest01 {
    public static void main(String[] args) {
        // Criando uma coleção
        List<String> carros = new ArrayList<String>();
        carros.add("Dodge");
        carros.add("BMW");
        carros.add("Audi");
        carros.add("Mercedes");
        carros.add("Ferrari");
        carros.add("Willians");
        carros.add("Mclaren");


        // Instanciando um iterator para a coleção de carros
        Iterator<String> it = carros.iterator();

        // Printando o primeiro item da coleção
        System.out.println(it.next());

        // Percorrendo a coleção - Comentar quando foi realizar operação de exclusão
        //while (it.hasNext()){
        //    System.out.println(it.next());
        //}

        // Removendo itens da coleção
        String item = it.next();
        while (it.hasNext()){
            item = it.next();
            if (item.charAt(0) == 'M'){
                it.remove();
            }
        }

        System.out.println(carros);

        // Recurso de programação funcional que usa Iterator pelos fundos
        carros.removeIf(car -> car.charAt(0) == 'A');

        System.out.println(carros);
    }
}
