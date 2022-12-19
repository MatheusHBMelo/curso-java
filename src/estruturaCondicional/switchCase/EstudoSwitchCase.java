package estruturaCondicional.switchCase;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //01
        System.out.println("Digite um numero correspondente a um dia da semana: ");
        int diaNumero = sc.nextInt();

        String dia = switch (diaNumero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sabado";
            default -> "Valor invalido";
        };
        System.out.println("Dia da semana: "+ dia);

        sc.close();
    }
}
