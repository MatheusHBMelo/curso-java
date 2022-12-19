package arrays.vetorUnidimensional.exercicios.abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
         */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];
        }

        double media = sum / n;

        System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", media));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
