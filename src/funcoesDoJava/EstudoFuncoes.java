package funcoesDoJava;

import java.util.Scanner;

public class EstudoFuncoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler três números inteiros e mostrar qual o maior (Usar funções)
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        sc.close();
    }

    public static int max(int x, int z, int y){
        int aux;
        if (x > z && x > y){
            aux = x;
        } else if (z > y){
            aux = z;
        } else {
            aux = y;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior = " + value);
    }
}
