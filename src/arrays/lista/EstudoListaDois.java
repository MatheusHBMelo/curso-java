package arrays.lista;

import java.util.List;
import java.util.ArrayList;

public class EstudoListaDois {
    public static void main(String[] args) {
        // Declarando uma lista
        List<Integer> lista;

        // Instanciando a Lista
        lista = new ArrayList<>();

        // Colocando 5 elementos
        lista.add(2);
        lista.add(5);
        lista.add(8);
        lista.add(15);
        lista.add(20);
        lista.add(35);

        // Imprimindo os elementos da lista
        for (Integer x: lista){
            System.out.println(x);
        }
        separador();

        // Adicionando elemento na posição 6
        lista.add(3, 19);

        // Imprimindo os elementos da lista
        for (Integer x: lista){
            System.out.println(x);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        separador();

        // Removendo o elemento 5
        lista.remove(Integer.valueOf(5));

        // Imprimindo os elementos da lista
        for (Integer x: lista){
            System.out.println(x);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        separador();

        // Removendo todos os elementos que começam com numero 2
        lista.removeIf(x -> x.toString().charAt(0) == '2');

        // Imprimindo os elementos da lista
        for (Integer x: lista){
            System.out.println(x);
        }
        separador();

        // Retornando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());
        separador();

        // Encontrando a posição do elemento 8
        System.out.println("Elemento 8 posição: " + lista.indexOf(8));
        separador();

        // Encontrando a posição do elemento 15
        System.out.println("Elemento 15 posição: " + lista.indexOf(15));
        separador();

        // Capturando todos maiores que 10
        List<Integer> lista2 = lista.stream().filter(x -> x > 10).toList(); // Pode ser .toList();

        // Pritando nova lista com elementos maiores que 20
        for (Integer xx: lista2){
            System.out.println(xx);
        }
        separador();

        // capturando e Imprimindo os elementos da lista2 com apenas iniciais por letra 1
        List<Integer> lista3 = lista2.stream().filter(xx -> xx.toString().charAt(0) == '1').toList();
        for (Integer xxx: lista3){
            System.out.println(xxx);
        }
        separador();

        // Capturando e printando o primeiro elemento com numero inicial 1
        Integer num1 = lista3.stream().filter(xxx -> xxx.toString().charAt(0) == '1').findFirst().orElse(null);
        System.out.println("Primeiro elemento com 1: " + num1);
        separador();

        // Capturando o elemento da posição 3
        System.out.println("Posição 3: " + lista.get(3));
        separador();
    }
    public static void separador(){
        System.out.println("\n-----\n");
    }
}
