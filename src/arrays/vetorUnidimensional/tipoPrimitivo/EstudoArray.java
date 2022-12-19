package arrays.vetorUnidimensional.tipoPrimitivo;

import java.util.Locale;
import java.util.Scanner;

public class EstudoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        double soma = 0.0, avg;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor do vetor na posição " + i + ": ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        avg = soma / n;

        System.out.println("AVERAGE HEIGHT: " + String.format("%.2f%n", avg));

        sc.close();
    }
}
