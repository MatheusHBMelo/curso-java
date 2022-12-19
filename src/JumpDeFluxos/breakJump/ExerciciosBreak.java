package JumpDeFluxos.breakJump;

import java.util.Scanner;

public class ExerciciosBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Exercicio 02
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        sc.close();
    }
}
