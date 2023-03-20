package collections.stack;

import java.util.Stack;

public class EstudoStack01 {
    public static void main(String[] args) {
        // Declarando uma stack de String
        Stack<String> pilha = new Stack<>();

        // Adicionando elementos ao topo da pilha
        pilha.push("Matheus");
        pilha.push("Davi");
        pilha.push("Gabriel");
        pilha.push("Marcus");
        pilha.push("Pedro");

        // Retornando o elemento do topo da pilha
        System.out.println(pilha.peek());

        // Verificando se a pilha está vazia
        System.out.println(pilha.empty());

        // Procurando um nome dentro da coleção - (-1 == não existe)
        System.out.println(pilha.search("Gabriel"));
        System.out.println(pilha.search("Max"));

        // Removendo o elemento do topo da pilha (´Pedro')
        pilha.pop();

        // Retornando elementos com expressão lambda
        pilha.forEach((number) -> System.out.print(number + " "));

        System.out.println(" ");

        // Retornando os elementos com method reference
        pilha.forEach(System.out::print);
    }
}
