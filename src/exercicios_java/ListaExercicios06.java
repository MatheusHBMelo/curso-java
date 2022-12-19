package exercicios_java;

import java.util.Scanner;
import java.util.Locale;

public class ListaExercicios06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Exercicio 01
        Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
        Após isso determine o maior número da matriz e a sua posição (linha, coluna)
         */
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j]= (int) ( Math.random() * 50);
            }
        }

        // Mostrando os numeros
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        // Maior número
        int maior = 0;
        int col = 0, lin = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] > maior){
                    maior = M[i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Posição: (" + lin + ", " + col + ")");

        System.out.println("------------------");
        /* Exercicio 02
        Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0 e 9.
        Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7
         */
        int [][] emi = new int[10][10];

        for (int i = 0; i < emi.length; i++) {
            for (int j = 0; j < emi[i].length; j++) {
                emi[i][j]= (int) ( Math.random() * 100);
            }
        }

        for (int i = 0; i < emi.length; i++) {
            for (int j = 0; j < emi[i].length; j++) {
                System.out.print(emi[i][j] + " ");
            }
            System.out.println();
        }

        int maior5 = 0, menor5 = Integer.MAX_VALUE;
        for (int i = 0; i < emi[5].length; i++) {
            if (emi[5][i] > maior5){
                maior5 = emi[5][i];
            }
            if (emi[5][i] < menor5){
                menor5 = emi[5][i];
            }
        }
        System.out.println("Maior linha 5: " + maior5);
        System.out.println("Menor linha 5: " + menor5);

        int maiorc7 = 0, menorc7 = Integer.MAX_VALUE;
        for (int i = 0; i < emi.length; i++) {
            if (emi[i][7] > maiorc7){
                maiorc7 = emi[i][7];
            }
            if (emi[i][7] < menorc7){
                menorc7 = emi[i][7];
            }
        }
        System.out.println("Maior coluna 7: " + maiorc7);
        System.out.println("Menor coluna 7: " + menorc7);

        /* Exercicio 03
        Capture do teclado valores para preenchimento de uma matriz M 3x3.
        Após a captura imprima a matriz criada e encontre a quantidade de numeros pares e a quatidade de numeros impares
         */
        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("Digite os valores da matriz: ");
                matrizM[i][j] = sc.nextInt();
            }
        }

        int valorImpar = 0, valorPar = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] % 2 == 0){
                    valorPar++;
                } else {
                    valorImpar++;
                }
            }
        }
        System.out.println("Impares: " + valorImpar);
        System.out.println("Pares: " + valorPar);

        /* Exercicio 04
        Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24h,
        onde para cada uma destas 24h podemos associar uma tarefa especifica.
        O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora,
        entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda,
        fornecendo dia e hora para obter o compromisso armazenado.
         */
        String[][] matriz = new String[31][24]; // Criando uma matriz para representar 31 dias e 24 horas cada dia

        boolean sair = false;
        int opcao;
        while (!sair){
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Consultar a agenda");
            System.out.println("0 - Sair");

            System.out.print("\nOpção escolhida: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    boolean diaValido = false;
                    int dia = 0;
                    while (!diaValido) {
                        System.out.print("\nQual dia deseja adicionar um compromisso: ");
                        dia = sc.nextInt();

                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("\nDia invalido, digite novamente!");
                        }
                    }
                    boolean horarioValido = false;
                    int hora = 0;
                    while (!horarioValido) {
                        System.out.print("\nQual hora deseja adicionar o compromisso: ");
                        hora = sc.nextInt();

                        if (hora >= 0 && hora <= 24) {
                            horarioValido = true;
                        } else {
                            System.out.println("\nHorario invalido, digite novamente!");
                        }
                    }
                    sc.nextLine();
                    System.out.print("\nDigite o nome do compromisso: ");
                    matriz[--dia][hora] = sc.nextLine();
                    System.out.print("\n");
                }
                case 2 -> {
                    boolean diaValido2 = false;
                    int dia2 = 0;
                    while (!diaValido2) {
                        System.out.print("\nQual dia deseja consultar um compromisso: ");
                        dia2 = sc.nextInt();

                        if (dia2 > 0 && dia2 <= 31) {
                            diaValido2 = true;
                        } else {
                            System.out.println("\nDia invalido, digite novamente!");
                        }
                    }
                    boolean horarioValido2 = false;
                    int hora2 = 0;
                    while (!horarioValido2) {
                        System.out.print("\nEm qual hora deseja consultar os compromissos do dia: ");
                        hora2 = sc.nextInt();

                        if (hora2 >= 0 && hora2 <= 24) {
                            horarioValido2 = true;
                        } else {
                            System.out.println("\nHorario invalido, digite novamente!");
                        }
                    }
                    System.out.println("\nCompromisso: " + matriz[--dia2][hora2]);
                    System.out.println("\n");
                }
                case 0 -> {
                    System.out.println("Programa encerrado com sucesso!");
                    sair = true;
                }
                default -> System.out.println("Digite uma opção válida!");
            }
        }

        /* Exercicio 05
        Escreva um programa Java que declara e constrói uma matriz de 10 elementos do tipo int.
        Em seguida use um laço for para inicializar os elementos com os valores de 1 até 10.
        Para finalizar exiba os valores dos elementos da matriz na vertical.
         */
        int[][] matrizTen = new int[10][10];

        for (int i = 0; i < matrizTen.length; i++) {
            for (int j = 0; j < matrizTen[i].length; j++) {
                matrizTen[i][j] = (int) (Math.random() * 11);
            }
        }

        for (int i = 0; i < matrizTen.length; i++) {
            for (int j = 0; j < matrizTen[i].length; j++) {
                System.out.println(matrizTen[i][j]);
            }
        }

        /* Exercicio 06
        Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal
        principal e a quantidade de valores negativos da matriz.
         */
        System.out.print("Digite um numero N: ");
        int numeroN = sc.nextInt();

        int[][] matrizN = new int[numeroN][numeroN];

        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN[i].length; j++) {
                matrizN[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN[i].length; j++) {
                System.out.print(matrizN[i][j] + "\t");
            }
            System.out.println("--");
        }

        System.out.println("--------------------");

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matrizN.length; i++) {
            System.out.print(matrizN[i][i] + " ");
        }

        System.out.println("\n--------------------");

        System.out.println("Números negativos: ");
        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN[i].length; j++) {
                if (matrizN[i][j] < 0){
                    System.out.print(matrizN[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
