package interfaces.defaultmethods;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Months: ");
        int months = sc.nextInt();
        sc.nextLine();

        InterestService bis = new BrazilInterestService(2.0);
        double payment = bis.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("R$%.2f", payment));

        sc.close();
    }
}
