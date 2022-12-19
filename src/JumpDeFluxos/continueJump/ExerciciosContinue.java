package JumpDeFluxos.continueJump;

import java.util.Scanner;

public class ExerciciosContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // Exercicio 02
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        // Exercicio 03
        for (int l = 0; l <= 15; l++) {

            // Check condition for continue
            if (l == 10 || l == 12) {

                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }

        // Exercicio 04
        // Creating and Initializing a variable
        int j = 0;

        // Do-While loop for iteration
        do {
            if (j == 4 || j == 18) {

                // Incrementing loop variable by 2
                j += 2;

                // Illustrating continue statement skipping
                // the execution  when i==7 or i==15
                continue;
            }

            // Printing to showcase continue affect
            System.out.println(j);

            // Incrementing variable by 2
            j += 2;

            // Condition check
        } while (j <= 35);

        // Exercicio 05
        // Outer loop for iteration
        for (int h = 1; h <= 4; h++) {

            // Inner loop for iteration
            for (int m = 1; m <= 3; m++) {
                if (h == 3 && m == 2) {

                    // Continue statement in inner loop to
                    // skip the execution when i==3 and j==2

                    continue;
                }

                // Print elements to showcase keyword affect
                System.out.println(h + " * " + m);
            }
        }
        sc.close();
    }
}
