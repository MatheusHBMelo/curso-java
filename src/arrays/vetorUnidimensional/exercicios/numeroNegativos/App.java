package arrays.vetorUnidimensional.exercicios.numeroNegativos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
         */
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero " + i + ": ");
            vetor[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for (int i = 0; i < n; i++){
                if (vetor[i] < 0) {
                    System.out.printf("%d%n", vetor[i]);
                }
        }
        sc.close();
    }
}
