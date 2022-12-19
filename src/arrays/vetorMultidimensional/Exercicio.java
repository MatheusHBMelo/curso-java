package arrays.vetorMultidimensional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da ordem da matriz: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[4][9];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v1 = sc.nextInt();
                sc.nextLine();
                mat[i][j] = v1;
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("\nNumeros negativos: " + count);

        System.out.println("Linhas: " + mat.length);
        System.out.println("Colunas: " + mat[0].length);
        sc.close();
    }
}
