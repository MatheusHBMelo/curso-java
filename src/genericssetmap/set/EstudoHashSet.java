package genericssetmap.set;

import java.util.HashSet;
import java.util.Set;

public class EstudoHashSet {
    public static void main(String[] args) {

        /* Informações sobre HASHSET
           É a implementação mais rapida para a interface SET;
           HASHSET não garante a ordem dos elementos;
           Só aceita classes, por tanto, deve-se utilizar as Wrapper class dos tipos primitivos

           Se a ordem não importa, o HASHSET é o mais indicado por ser o mais rápido.
         */

        // Instanciando uma estrutura de coleção HASHSET para Strings e nomeando-a por set.
        Set<String> set = new HashSet<>();

        // Utilizando o método add para inserir três valores String na coleção.
        set.add("Matheus");
        set.add("Davi");
        set.add("Marcos");
        set.add("Carlos");
        set.add("Kimmich");
        set.add("Davies");
        set.add("Goretzka");

        // Utilizando o método TOARRAY para passar o elementos da coleção para um array de objects
        Object[] vetor = set.toArray();
        System.out.print("Array: ");
        for (Object o : vetor) {
            System.out.print(o + " ");
        }

        // Utilizando o método CONTAINS para verificar se a coleção CONTEM tal elemento, String passada por parametro.
        System.out.println("\nContem o elemento Matheus: " + set.contains("Matheus"));
        System.out.println("Contem o elemento Henrique: " + set.contains("Henrique"));

        // Fazendo um FOREACH para percorrer a estrutura da coleção e imprimir os itens contidos.
        System.out.print("Elementos: ");
        for (String p : set){
            System.out.print(p + " ");
        }

        // Utilizando o método SIZE para descobrir quantos itens existem na coleção
        System.out.println("\nTamanho da coleção: " + set.size() + " elementos");

        // Utilizando o método REMOVE para remover um elemento da coleção.
        set.remove("Marcos");
        set.remove("Carlos");

        // Utilizando o método REMOVEIF para remover um elemento da coleção se predicado: lenght > 7
        set.removeIf(x -> x.length() > 7);

        // Utilizando o método SIZE para descobrir quantos itens existem na coleção
        System.out.println("Novo tamanho da coleção: " + set.size() + " elementos");

        // Fazendo um FOREACH para percorrer a estrutura da coleção e imprimir os itens contidos.
        System.out.print("Elementos: ");
        for (String p : set){
            System.out.print(p + " ");
        }

        // Utilizando o método CLEAR para remover todos os itens da coleção
        set.clear();

        // Utilizando o método SIZE para descobrir quantos itens existem na coleção
        System.out.println("\nColeção após o método clear: " + set.size() + " elementos");

        // Utilizando o método ISEMPTY para verificar se a coleção está vazia
        System.out.println("A coleção está vazia? " + set.isEmpty());

        /* Informações extras:

            União = Junção dos elementos de ambas as coleção, não permitindo repetição
            Ex.: set1 = {1, 2, 5, 7} - set2 = {1, 3, 5, 7, 8} - União set1 with set2 = {1, 2, 3, 5, 7, 8}

            Interseção = Seleção dos elementos comuns entre as duas coleções
            Ex.: set1 = {1, 2, 5, 7} - set2 = {1, 3, 5, 7, 8} - Interseção set1 with set2 = {1, 5, 7}

            Diferença = Seleção dos elementos  da coleção 1 que não são comuns na coleção 2
            Ex.: set1 = {1, 2, 5, 7} - set2 = {1, 3, 5, 7, 8} - Diferença set1 with set2 = {2}
         */

        // Criando duas novas coleções HASHSET de Integer para testar o metodo de união
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(6);
        numbers1.add(7);
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(7);
        numbers2.add(5);
        numbers2.add(2);
        numbers2.add(0);

        // Fazendo um FOREACH para percorrer a estrutura da coleção e imprimir os itens contidos.
        System.out.print("\nElementos numbers1: ");
        for (Integer n : numbers1){
            System.out.print(n + " ");
        }

        System.out.print("\nElementos numbers2: ");
        for (Integer n : numbers2){
            System.out.print(n + " ");
        }

        // Utilizando o método ADDALL para realizar a operação de união entre as duas coleções
        System.out.print("\nUnião - " + numbers1.addAll(numbers2) + " - Valores: ");
        for (Integer n : numbers1){
            System.out.print(n + " ");
        }

        System.out.println("\n");

        // Criando duas novas coleções HASHSET de Integer para testar o metodo de diferença
        Set<Integer> numbers3 = new HashSet<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(5);
        numbers3.add(7);
        Set<Integer> numbers4 = new HashSet<>();
        numbers4.add(1);
        numbers4.add(3);
        numbers4.add(5);
        numbers4.add(7);
        numbers4.add(8);

        // Fazendo um FOREACH para percorrer a estrutura da coleção e imprimir os itens contidos.
        System.out.print("\nElementos numbers3: ");
        for (Integer n : numbers3){
            System.out.print(n + " ");
        }

        System.out.print("\nElementos numbers4: ");
        for (Integer n : numbers4){
            System.out.print(n + " ");
        }

        // Utilizando o método REMOVEALL para realizar a operação de diferença entre as duas coleções
        System.out.print("\nDiferença - " + numbers3.removeAll(numbers4) + " - Valores: ");
        for (Integer n : numbers3){
            System.out.print(n + " ");
        }

        System.out.println("\n");

        numbers1.clear();
        numbers2.clear();
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(6);
        numbers1.add(7);
        numbers2.add(1);
        numbers2.add(7);
        numbers2.add(5);
        numbers2.add(2);
        numbers2.add(0);

        // Fazendo um FOREACH para percorrer a estrutura da coleção e imprimir os itens contidos.
        System.out.print("\nElementos numbers1: ");
        for (Integer n : numbers1){
            System.out.print(n + " ");
        }

        System.out.print("\nElementos numbers2: ");
        for (Integer n : numbers2){
            System.out.print(n + " ");
        }

        // Utilizando o método RETAINALL para realizar a operação de interseção entre as duas coleções
        System.out.print("\nInterseção - " + numbers1.retainAll(numbers2) + " - Valores: ");
        for (Integer n : numbers1){
            System.out.print(n + " ");
        }
    }
}
