package estruturaCondicional.switchCase;

import java.util.Scanner;

public class ExerciciosSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = System.currentTimeMillis();
        System.out.println("Tempo: " + (System.currentTimeMillis() -i));

        // Exercicio 01
        System.out.println("Digite o seu conceito: ");
        char conceito = sc.next().charAt(0);

        switch (conceito) {
            case 'A' -> System.out.println("Excelente");
            case 'B' -> System.out.println("Ótimo");
            case 'C' -> System.out.println("Bom");
            case 'D' -> System.out.println("Regular");
            case 'E' -> System.out.println("Ruim");
            case 'F' -> System.out.println("Pessimo");
            default -> System.out.println("Opção invalida");
        }

        // Exercicio 02
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
        }

        sc.close();
    }
}
