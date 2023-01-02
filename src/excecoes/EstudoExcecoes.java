package excecoes;

import java.util.Scanner;

public class EstudoExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um vetor de String separando o elementos pelo "espaço"
        System.out.print("Digite os elementos do vetor: ");
        String[] vect = sc.nextLine().split(" ");

        // Criando uma variavel para receber um numero inteiro e encontrar indice no vetor
        System.out.print("Digite o valor do indice que será buscado: ");
        int position = sc.nextInt();
        sc.nextLine();

        // Imprimindo o elemento correspondente a posição do indice no vetor
        System.out.println("Elemento: " + vect[position]);

        sc.close();
    }
}
