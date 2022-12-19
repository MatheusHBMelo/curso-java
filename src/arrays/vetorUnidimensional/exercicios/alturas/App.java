package arrays.vetorUnidimensional.exercicios.alturas;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Pessoa pessoa;

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
         */

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vect = new Pessoa[n];

        // Gerandos os dados (nome, idade, altura) das pessoas no array
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1)  + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        double alturaMedia = 0.0, sum = 0;
        int menorIdade = 0;

        // Gerando a somatoria das alturas
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }

        // Gerando a média das alturas
        alturaMedia = sum / vect.length;

        // Descobrindo a quantidade de pessoas com menos de 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16){
                menorIdade++;
            }
        }

        // Gerando a porcentagem de pessoas menores de 16 anos
        double porcentagemMenores = (double) menorIdade * 100 / n;

        System.out.println("\nALTURA MÉDIA: " + String.format("%.2f", alturaMedia) + "m");
        System.out.println("PESSOAS COM MENOS DE 16 ANOS: " + String.format("%.2f", porcentagemMenores) + "%");

        // For para descobrir o nome das pessoas com <16< anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}
