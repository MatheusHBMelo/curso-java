package membrosEstaticos.conversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

public class AppCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dollar price?: ");
        double contation = sc.nextDouble();

        System.out.print("How many dollares will be bought?: ");
        double value = sc.nextDouble();

        System.out.printf("Amout to be paid in reais = %.2f%n", CurrencyConverter.convert(contation, value));

        sc.close();
    }
}
