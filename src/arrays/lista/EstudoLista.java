package arrays.lista;

import java.util.List;
import java.util.ArrayList;

public class EstudoLista {
    public static void main(String[] args) {
        // Declarando uma lista
        List<String> lista;

        // Instanciando a Lista
        lista = new ArrayList<>();

        // Colocando 9 elementos
        lista.add("Matheus Henrique");   // Posição = 0
        lista.add("Davi Jose");      // Posição = 1
        lista.add("Vera Lucia");      // Posição = 2
        lista.add("Silvania Barbosa");  // Posição = 3
        lista.add("Silvia Maria");    // Posição = 4
        lista.add("Simone Maria");    // Posição = 5
        lista.add("Maria Eduarda");     // Posição = 6
        lista.add("Maria Luiza");       // Posição = 7
        lista.add("Leticia Vitoria");   // Posição = 8

        // Imprimindo os elementos da lista
        for (String s: lista) {
            System.out.println(s);
        }
        separador();

        // Adicionando elemento na posição 6
        lista.add(6, "Edjose Martins");

        // Imprimindo os elementos da lista
        for (String s: lista) {
            System.out.println(s);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho lista: " + lista.size());
        separador();

        // Removendo o elemento "Leticia Vitoria"
        lista.remove("Leticia Vitoria");

        // Imprimindo os elementos da lista
        for (String s: lista) {
            System.out.println(s);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho lista: " + lista.size());
        separador();

        // Removendo todos os elementos que começam com letra 'S'
        lista.removeIf(s -> s.charAt(0) == 'S');

        // Imprimindo os elementos da lista
        for (String s: lista) {
            System.out.println(s);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho lista: " + lista.size());
        separador();

        // Encontrando a posição do elemento "Matheus Henrique"
        System.out.println("Posição Matheus: " + lista.indexOf("Matheus Henrique"));
        separador();

        // Encontrando a posição do elemento "Davi Jose"
        System.out.println("Posição Davi: " + lista.indexOf("Davi Jose"));
        separador();

        // Capturando todos com a letra 'M'
        List<String> lista2 = lista.stream().filter(s -> s.charAt(0) == 'M').toList(); // Pode ser .toList();

        // Imprimindo os elementos da lista2 com apenas iniciais por letra 'M'
        for (String x: lista2) {
            System.out.println(x);
        }
        separador();

        // Capturando o primeiro elemento com a letra inicial 'V'
        String nome = lista.stream().filter(s -> s.charAt(0) == 'V').findFirst().orElse(null);

        // Printando o primeiro elemento com a letra inicia 'V'
        System.out.println("Primeiro elemento com inicial 'V': " + nome);
        separador();

        // Capturando o elemento da posição 3
        System.out.println("Elemento posição = 3: " + lista.get(3));
        separador();
    }
    public static void separador(){
        System.out.println("\n-----------------\n");
    }
}
