package estruturaRepetitiva.doWhile;

import java.util.Locale;
import java.util.Scanner;

public class EstudoDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Digite a temperatura em celcius: ");
            double temperatura = sc.nextDouble();
            sc.nextLine();
            double conversao = (9 * temperatura / 5) + 32;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", conversao);
            System.out.println("Deseja repetir (s/n)");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
        System.out.println("Programa finalizado");

        sc.close();
    }
}
