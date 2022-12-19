package arrays.vetorMultidimensional;

import java.util.Locale;
import java.util.Scanner;

public class EstudoMatriz3Dimensao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Exercicio para entendimento de matrizes com 3 dimensões
        Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus indices
        Exemplo: M[1, 2, 1] = 1 + 2 + 1 = 4

        Obtenha a soma de todos os elementos da matriz, e obtenha a soma do elementos cujos valores são pares
        e a soma dos elementos cujos valores são impares.

        Exibir na tela o valor da soma total, soma dos pares e soma dos impares
         */

        // Declarando uma matriz de 3 dimensões
        int[][][] matrizTridimensional = new int[3][3][3];

        // For aninhado para matriz de 3 dimensões - Atribuindo a soma dos indices
        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        // Soma total dos elementos da matriz
        int soma = 0;
        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    soma += matrizTridimensional[i][j][k];
                }
            }
        }

        // Soma dos pares e impares
        int somaPares = 0, somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    if (matrizTridimensional[i][j][k] % 2 != 0){
                        somaImpares += matrizTridimensional[i][j][k];
                    }else {
                        somaPares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        System.out.println("\nSoma total: " + soma);
        System.out.println("Soma pares: " + somaPares);
        System.out.println("Soma impares: " + somaImpares);

        sc.close();
    }
}
