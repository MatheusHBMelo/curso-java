package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoStackTrace {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program!");
    }

    public static void method1(){
        System.out.println("**** METHOD1 START ****");
        method2();
        System.out.println("**** METHOD1 END ****");
    }

    public static void method2(){
        System.out.println("**** METHOD2 START ****");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite os elementos do vetor: ");
            String[] vect = sc.nextLine().split(" ");

            System.out.print("Digite o valor do indice que será buscado: ");
            int position = sc.nextInt();
            sc.nextLine();

            System.out.println("Elemento: " + vect[position]);
        }
        catch (InputMismatchException i){
            System.out.println("Input Error!");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Invalid position!");
            a.printStackTrace();
            sc.next();
        }

        sc.close();
        System.out.println("**** METHOD2 END ****");
    }
}
