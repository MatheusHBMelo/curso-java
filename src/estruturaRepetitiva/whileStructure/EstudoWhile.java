package estruturaRepetitiva.whileStructure;

import java.util.Scanner;

public class EstudoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (0 finaliza a contagem): ");
        int numero = sc.nextInt();
        sc.nextLine();

        int soma = 0;
        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro número (0 finaliza a contagem): ");
            numero = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("A soma dos números digitados é " + soma);

        sc.close();
    }
}
