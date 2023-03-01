package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Matheus");
        Consumidor c2 = new Consumidor("Davi");

        Carro car1 = new Carro(50L, "Fiat Mobi", 30000.00);
        Carro car2 = new Carro(10L, "Volkswagen Nyvus", 130000.00);

        Map<Consumidor, Carro> map = new HashMap<>();
        map.put(c1, car1);
        map.put(c2, car2);

        for (Map.Entry<Consumidor, Carro> set : map.entrySet()){
            System.out.println(set.getKey().getName() + " - " + set.getValue().getName());
        }
    }
}
