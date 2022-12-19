package estruturaRepetitiva.forStructure;

import java.util.Scanner;

public class EstudoFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você quer calcular: ");
        int numeroTotal = sc.nextInt();
        sc.nextLine();

        int soma = 0;
        int num;
        for (int contador = 1; contador <= numeroTotal; contador++){
            System.out.println("Número " + contador);
            num = sc.nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
