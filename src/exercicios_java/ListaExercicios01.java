package exercicios_java;

import java.util.Scanner;
import java.util.Locale;

public class ListaExercicios01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*01
        Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
        */
        System.out.println("Digite quantos anos você possui: ");
        int anos = sc.nextInt();

        System.out.println("Digite quantos meses você possui: ");
        int meses = sc.nextInt();

        System.out.println("Digite quantos dias você possui: ");
        int dias = sc.nextInt();

        int idadeDias = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Você já viveu %d dias. %n", idadeDias);

        /*02
        Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
        A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
        */
        double media1 = (double) (8 + 9 + 7) / 3;
        double media2 = (double) (4 + 5 + 6) / 3;

        double somaMedia = media1 + media2;
        double mediaFinal = somaMedia / 2;

        System.out.printf("Media 1 = %.2f%n", media1);
        System.out.printf("Media 2 = %.2f%n", media2);
        System.out.printf("Soma das medias = %.2f%n", somaMedia);
        System.out.printf("Media das medias = %.2f%n", mediaFinal);

        /*03
        Informar um saldo e imprimir o saldo com reajuste de 1%.
         */
        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        double reajuste = saldo + (saldo * 0.01);

        System.out.printf("Saldo com correção: R$%.2f %n", reajuste);

        /*04
        Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$1212,00)
         */
        System.out.println("Digite o valor do salário minimo: ");
        double minSalary = sc.nextDouble();

        System.out.println("Digite o valor do seu salário: ");
        double yourSalary = sc.nextDouble();

        double qtdSalarios = minSalary / yourSalary;

        System.out.printf("Você recebe %.1f salarios minimos %n", qtdSalarios);

        /*05
        Desenvolva um algoritmo em Java que leia um número inteiro
        e imprima o seu antecessor e seu sucessor.
         */
        System.out.println("Digite um numero inteiro: ");
        int numInt = sc.nextInt();

        int numAnterior = numInt - 1;
        int numPosterior = numInt + 1;

        System.out.printf("Numero anterior: %d | Numero escolhido: %d | Numero posterior: %d %n", numAnterior, numInt, numPosterior);

        sc.close();
    }
}
