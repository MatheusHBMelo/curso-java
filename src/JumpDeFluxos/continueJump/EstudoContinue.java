package JumpDeFluxos.continueJump;

import java.util.Scanner;

public class EstudoContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Usando loop FOR
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Usando declaração continue
                continue; // Pula o valor e o restante da declaração será ignorada
            }
            System.out.println(i);
        }

        // Usando loop WHILE
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                // usando continue
                i++;
                continue; // Isso irá ignorar o restante da declaração
            }
            System.out.println(i);
            i++;
        }

        // Usando loop DO WHILE
        i = 0;
        do{
            if(i == 5){
                //usando declaração continue
                i++;
                continue; //Isto irá ignorar o restante da declaração
            }
            System.out.println(i);
            i++;
        }while(i <= 10);

        sc.close();
    }
}
