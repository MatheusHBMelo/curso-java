package arrays.vetorUnidimensional.tipoReferenciaClasse;

import java.util.Locale;
import java.util.Scanner;

public class EstudoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        sc.nextLine();

        Produto[] vect = new Produto[n];

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome do produto " + i + ": ");
            String name = sc.next();
            System.out.print("Digite o preço do produto " + i + ": ");
            double price = sc.nextDouble();

            vect[i] = new Produto(name, price);

            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.println("\nAVERAGE PRICE: " + String.format("R$%.2f%n", avg));

        sc.close();
    }
}
