package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        // Instanciando dois objetos do tipo Consumidor
        Consumidor c1 = new Consumidor("Matheus");
        Consumidor c2 = new Consumidor("Davi");

        // Instanciando seis objetos do tipo Carro
        Carro car1 = new Carro(50L, "Fiat Mobi", 30000.00);
        Carro car2 = new Carro(10L, "Volkswagen Nyvus", 130000.00);
        Carro car3 = new Carro(10L, "Ford Focus", 40000.00);
        Carro car4 = new Carro(10L, "Nissan March", 35000.00);
        Carro car5 = new Carro(10L, "Chevrolet Onix", 56000.00);
        Carro car6 = new Carro(10L, "Dodge Challenger", 100000.00);

        // Declarando duas listas de Carros
        List<Carro> l1 = List.of(car1, car2, car3);
        List<Carro> l2 = List.of(car4, car5, car6);

        // Criando um mapa com Key=Consumidor e Value=ListOfCarro
        Map<Consumidor, List<Carro>> map = new HashMap<>();

        // Adicionando os elementos (Key and Value)
        map.put(c1, l1);
        map.put(c2, l2);

        // Percorrendo o mapa e imprimindo o nome do Consumidor e a lista de carros dele com EntrySet
        for (Map.Entry<Consumidor, List<Carro>> set : map.entrySet()){
            System.out.print(set.getKey().getName() + ": ");
            for (Carro car : set.getValue()){
                System.out.print(car.getName() + ", ");
            }
            System.out.println(" ");
        }
    }
}
