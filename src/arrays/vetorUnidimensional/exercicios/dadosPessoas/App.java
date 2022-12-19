package arrays.vetorUnidimensional.exercicios.dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Pessoa pessoa;
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.
         */

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vect = new Pessoa[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite a altura da pessoa " + (i+1) + ": ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite o genero da pessoa " + (i+1) + ": ");
            char genero = sc.next().charAt(0);

            vect[i] = new Pessoa(altura, genero);
        }
        int qtdM = 0;
        int qtdH = 0;
        double sumM = 0.0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGenero() == 'F'){
                sumM += vect[i].getAltura();
                qtdM++;
            } else {
                qtdH++;
            }
        }

        double maior = 0.0;
        double menor = 0.0;
        for (int i = 0; i < vect.length; i++) {
            if (i == 0){
                maior = vect[i].getAltura();
                menor = vect[i].getAltura();
            }
            if (vect[i].getAltura() > maior){
                maior = vect[i].getAltura();
            }
            if (vect[i].getAltura() < menor){
                menor = vect[i].getAltura();
            }
        }

        System.out.println("Menor altura = " + String.format("%.2fm", menor));
        System.out.println("Maior altura = " + String.format("%.2fm", maior));
        System.out.println("Media das alturas das mulheres = " + String.format("%.2fm", sumM / qtdM));
        System.out.println("Numero de homens = " + String.format("%d", qtdH));

        sc.close();
    }
}
