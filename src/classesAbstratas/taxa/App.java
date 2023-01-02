package classesAbstratas.taxa;

import classesAbstratas.taxa.entities.Company;
import classesAbstratas.taxa.entities.Individual;
import classesAbstratas.taxa.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            sc.nextLine();

            if (answer == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            if (answer == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println("\nTAXES PAID:");
        for (TaxPayer tp: list){
            System.out.printf("%s: $%.2f%n", tp.getName(), tp.tax());
        }
        double totalTaxes = 0.0;
        for (TaxPayer tp: list){
            totalTaxes += tp.tax();
        }
        System.out.printf("\nTOTAL TAXES: $%.2f%n", totalTaxes);

        sc.close();
    }
}
