package arrays.vetorUnidimensional.exercicios.maiorPosicao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros que serão lidos: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        int maior = 0, posicaoMaior = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.println("\nMAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);

        sc.close();
    }
}