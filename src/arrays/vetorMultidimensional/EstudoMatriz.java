package arrays.vetorMultidimensional;

import java.util.Locale;
import java.util.Scanner;

public class EstudoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração de uma matriz tipo[][] nome_da_matriz = new tipo[tamanho][tamanho]
        byte[][] matriz1 = new byte[2][2];
        short[][] matriz2 = new short[2][2];
        int[][] matriz3 = new int[2][2];
        long[][] matriz4 = new long[2][2];
        float[][] matriz5 = new float[2][2];
        double[][] matriz6 = new double[2][2];
        boolean[][] matriz7 = new boolean[2][2];
        char[][] matriz8 = new char[2][2];
        String[][] matriz9 = new String[2][2];

        // Preenchendo uma matriz, usa-se um duplo for encadeado (I, J, K, L, M, ...)
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j] = (int) ( 1 + Math.random() * 10);
            }
        }

        // Imprimindo todos os elementos da matriz
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
        }

        System.out.println("\n----");

        // Imprimindo a diagonal principal de uma matriz (Basta pegar a posição [i][i] com um unico for)
        for (int i = 0; i < matriz3.length; i++) {
            System.out.print(matriz3[i][i] + " ");
        }

        // Declarando uma matriz literal tipo[][] Nome = new tipo[][]{{valores, ...}, {valores2, ...}}
        double[][] matdoub = new double[][]{{1.2, 1.3, 1.4}, {1.5, 1.6, 1.7}};

        sc.close();
    }
}
