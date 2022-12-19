package funcoesDoJava.mathFunctions;
import java.util.Scanner;
import java.util.Locale;

public class EstudoFuncoesMatematicas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01 - Crie um programa que calcule o maior entre dois números

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int maior = Math.max(num1, num2);

        System.out.printf("O maior número é %d%n", maior);

        sc.close();
    }
}
