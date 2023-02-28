package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao {
    public static void main(String[] args) {

        // Instanciando uma lista de integer para os testes
        List<Integer> numerosLista = new ArrayList<>();
        numerosLista.add(1);
        numerosLista.add(2);
        numerosLista.add(3);
        numerosLista.add(4);
        numerosLista.add(5);

        // Imprimindo a lista
        System.out.println("Lista: " + numerosLista);

        // Convertendo lista para Array
        Integer[] listaTOArray = numerosLista.toArray(new Integer[0]);

        // Imprimindo o array convertido da lista
        System.out.println("Lista para Array: " + Arrays.toString(listaTOArray));

        // Instanciando um Array de integer com 3 posições para os testes
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 5;
        numerosArray[1] = 6;
        numerosArray[2] = 7;

        // Convertendo Array para Lista
        // 01 - Cria um link com o array, qualquer alteração reflete nos dois e se usar add ocorrerá uma exceção
        List<Integer> arrayToLista = Arrays.asList(numerosArray);
        System.out.println("Array: " + Arrays.toString(numerosArray));
        System.out.println("Array para lista: " + arrayToLista);

        // 02 - Forma simples, utilizando a sobrecarga do construtor, não haverá problemas
        List<Integer> arrayToLista2 = new ArrayList<>(Arrays.asList(numerosArray));
        System.out.println("Array: " + Arrays.toString(numerosArray));
        System.out.println("Array para lista2: " + arrayToLista2);

    }
}
