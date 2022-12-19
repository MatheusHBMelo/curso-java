package arrays.vetorUnidimensional.exercicios.maisVelho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.
         */
        Pessoa pessoa;

        System.out.print("Digite quantas pessoas vai cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vect = new Pessoa[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            vect[i] = new Pessoa(nome, idade);
        }

        int maisVelho = 0;
        int posicaoMaior = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() > maisVelho){
                maisVelho = vect[i].getIdade();
                posicaoMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHO: " + String.format("%s%n", vect[posicaoMaior].getNome()));

        sc.close();
    }
}
