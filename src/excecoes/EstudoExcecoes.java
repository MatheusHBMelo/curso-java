package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Criando um vetor de String separando o elementos pelo "espaço"
            System.out.print("Digite os elementos do vetor: ");
            String[] vect = sc.nextLine().split(" ");

            // Criando uma variavel para receber um numero inteiro e encontrar indice no vetor
            System.out.print("Digite o valor do indice que será buscado: ");
            int position = sc.nextInt();
            sc.nextLine();

            // Imprimindo o elemento correspondente a posição do indice no vetor
            System.out.println("Elemento: " + vect[position]);
        }
        catch (InputMismatchException i){
            // Capturando excecao por digitar caractere invalido no tipo inteiro
            System.out.println("Input Error!");
        }
        catch (ArrayIndexOutOfBoundsException a){
            // Capturando excecao por digitar um valor acima do limite do array
            System.out.println("Invalid position!");
        }
        System.out.println("End of program!");

        sc.close();
    }
}
