package arrays.vetorUnidimensional.exercicios.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Alunos aluno;
        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).
         */
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Alunos[] vect = new Alunos[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a nota do primeiro trimestre do aluno " + (i+1) + ": ");
            double nota1 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite a nota do segundo trimestre do aluno " + (i+1) + ": ");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("\nALUNOS APROVADOS:");
        for (int i = 0; i < vect.length; i++) {
            if (((vect[i].getNota1() + vect[i].getNota2()) / 2) >= 6.00){
                System.out.println("NOME: " + vect[i].getNome() + String.format("\t\tNOTA: %.2f", (vect[i].getNota1() + vect[i].getNota2()) / 2));
            }
        }
        sc.close();
    }
}
