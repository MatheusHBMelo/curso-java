package genericssetmap.problemasmotivadores.umReuso;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();

        System.out.print("Quantos número deseja ler: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número #" + (i+1) + ": ");
            ps.addValue(sc.nextInt());
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
