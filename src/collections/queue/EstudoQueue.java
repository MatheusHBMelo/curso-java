package collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EstudoQueue {
    public static void main(String[] args) {
        // Criando uma coleção de fila - FIFO {First In - First out
        Queue<String> fila = new LinkedList<>();

        // Adicionando arquivos as listas
        fila.add("Matheus");
        fila.add("Davi");
        fila.add("Carlos");
        fila.add("Marcos");

        System.out.println(fila);

        System.out.println("Topo da fila: " + fila.peek());

        System.out.println("Removendo elemento do topo da fila: " + fila.poll());

        System.out.println(fila);

        System.out.println(fila.isEmpty() ? "Fila vazia" : "Fila com elementos");
    }
}
