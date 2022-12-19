package arrays.vetorUnidimensional.exercicios.numeroPares;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
         */
        System.out.print("Quantos números serão lidos: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        int qtdPares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                qtdPares++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES: " + qtdPares);

        sc.close();
    }
}
