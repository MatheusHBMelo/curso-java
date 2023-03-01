package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // Criando um MAP com chave Long e valor String
        Map<Long, String> map = new HashMap<>();

        // Adicionando elementos ao mapa
        map.put(50L, "Matheus");
        map.put(30L, "Davi");
        map.put(41L, "Alison");
        map.put(10L, "Gustavo");
        map.put(20L, "Jeferson");

        // Adicionando elemento caso ainda não exista, isso evita perda de informações ou sobreescrita de dados.
        System.out.println(map.putIfAbsent(1L, "Gabriel"));
        System.out.println(map.putIfAbsent(35L, "Thiago"));
        System.out.println(map.putIfAbsent(41L, "Lucas"));
        System.out.println(map.putIfAbsent(20L, "Pedro"));

        // Percorrendo o mapa pelas chaves
        for (Long id : map.keySet()){
            System.out.println(id);
        }

        System.out.println("\n---------\n");

        // Percorrendo o mapa pelos valores
        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("\n---------\n");

        // Percorrendo o mapa por chave e valor com entrySet
        for (Map.Entry<Long, String> set : map.entrySet()) {
            System.out.println(set);
        }

        System.out.println("\n---------\n");

        // Retornando o tamanho do mapa
        System.out.println("Tamanho do mapa: " + map.size());

        // Verificando se o mapa está vazio
        System.out.println("Lista vazia ? " + map.isEmpty());
    }
}
