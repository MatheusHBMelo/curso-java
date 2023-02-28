package collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstudoMap {
    public static void main(String[] args) {

        // Instanciando uma coleção baseada na interface map, sendo implementada por HashMap
        // As keys da coleção são do tipo wrapper Integer, não podem ter dados repetidos.
        // Os valores da coleção são do tipo String, podem ter dados repetidos.
        Map<Integer, String> users = new HashMap<>();

        // Utilizando o método put para inserir 5 informações na coleção
        users.put(1, "Matheus");
        users.put(2, "Davi");
        users.put(3, "Marcos");
        users.put(4, "Paulo");
        users.put(5, "Jonas");
        users.put(8, null);

        // Utilizando o método putIfabsent para tentar inserir uma valor novo e depois um valor que já existe
        users.putIfAbsent(6, "Caio");
        users.putIfAbsent(2, "Davi"); // Não será possivel, já existe elemento com key e value iguais
        users.putIfAbsent(2, "Douglas"); // Não será possivel, já existe elemento com key igual

        // Percorrendo a estrutura da coleção, fazendo a busca de acordo com o tipo de dado do ID
        // O método keysey é utilizado para realizar a procura e retornar de acordo com o ID
        // Imprimindo o valor do ID concatenado com o valor armazenado na coleção referente a id, capturada por get.
        for (Integer id : users.keySet()) {
            System.out.println("ID: " + id + ", Valor: " + users.get(id));
        }

        // Utilizando o método get para pegar o valor referente a key 1
        System.out.println("\nTestando método Get: " + users.get(1));

        // Utilizando o método containsKey para verificar se existe alguma key com valor 10
        System.out.println("\nTestando método ContainsKey = 10: " + users.containsKey(10));

        // Utilizando o método containsValue para verificar se existe alguma elemento com valor Paulo
        System.out.println("\nTestando método ContainsValue =  Paulo: " + users.containsValue("Paulo"));

        // Utilizando o método size para verificar o tamanho da coleção
        System.out.println("\nTestando método size: " + users.size());

        // Utilizando isEmpty para verificar a coleção está vazia
        System.out.println("\nTestando método isEmpty: " + users.isEmpty());

        // Utilizando keySet para retornar as keys da coleção
        System.out.println("\nTestando método keyset: " + users.keySet());

        // Utilizando values para retornar os valores da coleção
        System.out.println("\nTestando método values: " + users.values());

        // Utilizando remove para remover o elemento onde a key seja igual a 6
        System.out.println("\nTestando método remove(key): " + users.remove(6));

        // Utilizando remove para remover o elemento onde a key seja igual a 6 e o value Jonnas
        System.out.println("\nTestando método remove(key, value): " + users.remove(5, "Jonnas")); // Não será possivel

        // Utilizando replace para substituir o valor do elemento com a key especificada
        users.replace(2, "David");

        // Utilizando replace para substituir o valor do elemento com a key especificada, indicando valor antigo e novo
        users.replace(1, "Matheus", "Mateus");

        // Percorrendo a estrutura da coleção
        for (Integer id : users.keySet()) {
            System.out.println("ID: " + id + ", Valor: " + users.get(id));
        }

        // Criando uma nova coleção map
        Map<Integer, String> usersBackup = new HashMap<>();

        // Copiando todas os elementos da coleção users para usersbackup
        usersBackup.putAll(users);

        // Estrutura da segunda coleção após copiar todos os valores da coleção 01
        System.out.println("\nKeys da usersBackup: " + usersBackup.keySet());
    }
}
