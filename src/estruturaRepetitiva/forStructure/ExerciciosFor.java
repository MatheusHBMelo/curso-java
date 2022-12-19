package estruturaRepetitiva.forStructure;

import java.util.Scanner;
import java.util.Locale;

public class ExerciciosFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
        um valor por linha, inclusive o X, se for o caso
         */
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();

        for (int contador = 1; contador < x; contador++){
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }

        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         */
        System.out.println("Digite a quantidade de valores que serão lidos: ");
        int N = sc.nextInt();

        int X;
        int in = 0;
        int out = 0;
        for (int contador = 1; contador <= N; contador++) {
            System.out.printf("[%d] valor de X: ", contador);
            X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);

        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
        Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
        Apresente a média ponderada para cada um destes conjuntos de 3 valores,
        sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
         */
        System.out.println("Digite a quantidade de valores que serão lidos: ");
        int Z = sc.nextInt();

        for (int i = 1; i <= Z; i++) {
            System.out.println("Digite o valor: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do
        primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
         */
        System.out.println("Digite a quantidade de valores a serem calculados: ");
        int valores = sc.nextInt();

        for (int cont = 1; cont <= valores; cont++) {
            System.out.printf("Digite o par [0%d]", cont);
            int d = sc.nextInt();
            sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();

            double divisao;
            if (e == 0){
                System.out.println("Divisão impossivel");
            } else {
                divisao = (double) d / e;
                System.out.printf("%.1f%n", divisao);
            }
        }

        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial.
        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1
         */
        System.out.println("Digite um número: ");
        int nume = sc.nextInt();

        int fat = 1;
        for (int c = 1; c <= nume; c++){
            fat = fat * c;
        }
        System.out.println(fat);

        /*
        Ler um número inteiro N e calcular todos os seus divisores
         */
        System.out.println("Digite um numero inteiro: ");
        int numInt = sc.nextInt();

        for (int contadorUm = 1; contadorUm <= numInt; contadorUm++){
            if (numInt % contadorUm == 0){
                System.out.println(contadorUm);
            }
        }

        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
        conforme exemplo.
         */
        System.out.println("Digite um numero inteiro: ");
        int numInteiro = sc.nextInt();

        for (int contadorFinale = 1; contadorFinale <= numInteiro; contadorFinale++){
            int quadrado = contadorFinale * contadorFinale;
            int cubo = contadorFinale * contadorFinale * contadorFinale;
            System.out.printf("%d %d %d%n", contadorFinale, quadrado, cubo);
        }

        sc.close();
    }
}
