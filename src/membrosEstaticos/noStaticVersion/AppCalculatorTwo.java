package membrosEstaticos.noStaticVersion;

import java.util.Locale;
import java.util.Scanner;

public class AppCalculatorTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Estanciando por não ser estático
        CalculatorTwo cal = new CalculatorTwo();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = cal.circumference(radius);
        double v = cal.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", cal.PI);

        sc.close();
    }
}
