package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class EstudoFila {
    public static void main(String[] args) {

        // *****************************************************

        // Queue = Estrutura de dados do tipo FIFO. First-In First-Out
        //		   Uma coleção projetada para armazenar elementos antes do processamento;
        //		   Estrutura de dados linear;
        //         Garante a ordem de inserção;
        //         Não faz ordenação;
        //         Adiciona, lê e remove dados.

        //         Enfileirar (enqueue) = offer()
        //         Desenfileirar (dequeue) = poll()

        // Onde as filas são uteis?

        // 1. Buffer do teclado (as letras devem aparecer na tela na ordem em que são pressionadas)
        // 2. Fila da impressora (os trabalhos de impressão devem ser concluídos em ordem)
        // 3. Usado em LinkedLists, PriorityQueues, pesquisa em largura

        // Implementações da interface Queue: LinkedList & PriorityQueue

        // *****************************************************

        // Instanciando a lista
        Queue<Integer> queue = new LinkedList<>();

        // Enfileirando os elementos
        queue.offer(12);
        queue.offer(9);
        queue.offer(18);
        queue.offer(4);
        queue.offer(13);
        queue.offer(21);
        queue.offer(23);
        queue.offer(21);
        queue.offer(5);

        // imprimindo a lista
        System.out.println(queue);

        // Removendo um elemento, por regra é o do topo, ou o primeiro a ser adicionado.
        System.out.println(queue.poll());

        // imprimindo a lista
        System.out.println(queue);

        // Elemento topo da lista
        System.out.println(queue.peek());

        // Retorna o topo da fila sem excluir
        System.out.println(queue.element());

        // imprimindo a lista
        System.out.println(queue);
    }
}
