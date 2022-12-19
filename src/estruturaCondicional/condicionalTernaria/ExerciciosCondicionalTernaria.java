package estruturaCondicional.condicionalTernaria;

import java.util.Scanner;

public class ExerciciosCondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 01
        int numeroDias = sc.nextInt();
        String resultado = (numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena";
        System.out.println(resultado);

        sc.close();
    }
}
