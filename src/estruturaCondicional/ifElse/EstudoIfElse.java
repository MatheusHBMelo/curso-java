package estruturaCondicional.ifElse;

import java.util.Locale;
import java.util.Scanner;

public class EstudoIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // 01
        System.out.println("Digite quantos minutos de telefone você utilizou: ");
        int minutos = sc.nextInt();

        double planoTel = 50.00;

        if (minutos > 100){
            planoTel += (minutos - 100) * 2.0;
        }

        System.out.printf("Você usou %d minutos com o custo total de R$%.2f%n", minutos, planoTel);

        // 02
        System.out.println("Digite o horario atual: ");
        int horario = sc.nextInt();

        if (horario >= 25 || horario < 0){
            System.out.println("Horario invalido!");
        } else {
            if (horario >= 6 && horario < 12){
                System.out.println("Bom dia!");
            }
            if (horario >= 12 && horario < 18) {
                System.out.println("Boa tarde!");
            }
            if (horario >= 18 || horario < 6) {
                System.out.println("Boa noite!");
            }
        }

        sc.close();
    }
}
