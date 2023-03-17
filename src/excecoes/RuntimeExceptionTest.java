package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptionTest {
    public static void main(String[] args) {

        // NullPointerException
        //Object obj = null;
        //System.out.println(obj.toString());

        // ArrayIndexOutOfBoundsException
        //int[] array = {1, 2};
        //System.out.println(array[2]);

        // ArithmeticException
       //int a = 5, b = 0;
        //System.out.println(a / b);

        // InputMismatchException

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();

            System.out.printf("Olá %s, você tem %d anos.", nome, idade);
        }
        catch (InputMismatchException ime){
            System.out.println("Error: Você digitou letras em um campo de numero inteiro!");
        }
        catch (RuntimeException re) {
            System.out.println("Error: " + re.toString());
        }

        sc.close();
    }
}
