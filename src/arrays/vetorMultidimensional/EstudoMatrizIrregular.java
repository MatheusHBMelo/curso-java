package arrays.vetorMultidimensional;

import java.util.Locale;
import java.util.Scanner;

public class EstudoMatrizIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Exercicio para entendimento de matrizes irregulares
        Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais movimentada
        da cidade onde você mora. A pesquisa consistem em perguntar ao cidadão a quantidade de filhos e o nome de cada um.

        Guarde essas informações em uma matriz de forma que cada pessoa entrevistada oculpe apenas o espaço necessário na
        memoria para guardar os nomes dos filhos.

        Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos nomes dos filhos
         */

        System.out.print("Quantas pessoas serão entrevistadas: ");
        int qtdEntrevistados = sc.nextInt();
        sc.nextLine();

        // Criando a matriz irregular com a quantidade de entrevistas previamente alocada
        String[][] nomesDosFilhos = new String[qtdEntrevistados][];

        // Criando o for onde serão setadas as colunas de diferentes tamanhos
        for (int i = 0; i < nomesDosFilhos.length; i++) {
            System.out.print("\nEntre com a quantidade de filhos da pessoa #" + (i+1) + ": ");
            int qtdFilhos = sc.nextInt();
            sc.nextLine();

            nomesDosFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesDosFilhos[i].length; j++) {
                System.out.print("Digite o número do filho #" + (j+1) + ": ");
                nomesDosFilhos[i][j] = sc.nextLine();
            }
        }

        // Imprimindo a pessoa e a quantidade de filhos
        for (int i = 0; i < nomesDosFilhos.length; i++) {
            System.out.println("\nPessoa #" + (i+1) + " tem " + nomesDosFilhos[i].length + " filhos:");
            for (int j = 0; j < nomesDosFilhos[i].length; j++) {
                System.out.println(nomesDosFilhos[i][j]);
            }
        }

        // Soma quantidade de filhos
        int totalFilhos = 0;
        for (int i = 0; i < nomesDosFilhos.length; i++) {
            for (int j = 0; j < nomesDosFilhos[i].length; j++) {
                totalFilhos += 1;
            }
        }
        System.out.println("\nTotal de filhos: " + totalFilhos);

        sc.close();
    }
}
