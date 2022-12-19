package exercicios_java.classes.desafioPensionato;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluguel aluguel;

        // Vetor fixo de 10 posições representando 10 quartos livres
        Aluguel[] vect = new Aluguel[10];

        // Definindo a quantidade de quartos que serão alugados
        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Armazenando a informação dos inquilinos no vetor
        for (int i = 1; i <= n; i++){
            System.out.println("\nRent #" + i + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vect[room] = new Aluguel(nome, email);
        }

        // Imprimindo em ordem os quartos ocupados com informações dos inquilinos
        System.out.println("\nBusy Rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
