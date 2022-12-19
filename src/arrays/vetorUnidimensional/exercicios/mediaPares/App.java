package arrays.vetorUnidimensional.exercicios.mediaPares;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
         */
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do numero " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }

        int contador = 0;
        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                sum += vetor[i];
                contador++;
            }
        }

        if (contador == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.println("MEDIA DOS PARES: " + (sum / contador));
        }

        sc.close();
    }
}
