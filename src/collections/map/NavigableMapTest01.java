package collections.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("B", "Letra B");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("A", "Letra A");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("--------------------------");

        NavigableMap<Consumidor, Carro> map2 = new TreeMap<>();

        // Consumidores
        Consumidor c1 = new Consumidor("Matheus");
        Consumidor c2 = new Consumidor("Davi");

        // Carros
        Carro car1 = new Carro(50L, "Fiat Mobi", 30000.00);
        Carro car2 = new Carro(10L, "Volkswagen Nyvus", 130000.00);

        map2.put(c1, car1);
        map2.put(c2, car2);

        for (Map.Entry<Consumidor, Carro> entry : map2.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
