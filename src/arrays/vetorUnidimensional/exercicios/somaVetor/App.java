package arrays.vetorUnidimensional.exercicios.somaVetor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] array = new double[n];

        double sum = 0.0, avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o valor do indice " + i + ": ");
            array[i] = sc.nextDouble();
            sum += array[i];
        }

        System.out.print("Valores: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.1f - ", array[i]);
        }

        System.out.println("\nSoma: " + sum);
        System.out.println("Média: " + sum / n);

        sc.close();
    }
}
