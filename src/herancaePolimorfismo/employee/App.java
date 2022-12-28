package herancaePolimorfismo.employee;

import herancaePolimorfismo.employee.entities.Employee;
import herancaePolimorfismo.employee.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + " data:");
            System.out.print("Outsourced (y/n): ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();
            sc.nextLine();

            if (answer == 'y' || answer == 'Y'){
                System.out.print("Additional charge: ");
                double addcharge = sc.nextDouble();
                sc.nextLine();

                list.add(new OutSourcedEmployee(name, hours, valuePerHours, addcharge));
            } else {
                list.add(new Employee(name, hours, valuePerHours));
            }
        }
        System.out.println("\nPAYMENTS:");
        for (Employee emps: list) {
            System.out.println(emps.getName() + " - $" + String.format("%.2f", emps.payment()));
        }

        sc.close();
    }
}
