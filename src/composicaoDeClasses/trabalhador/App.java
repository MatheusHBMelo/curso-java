package composicaoDeClasses.trabalhador;

import composicaoDeClasses.trabalhador.entities.Department;
import composicaoDeClasses.trabalhador.entities.HourContract;
import composicaoDeClasses.trabalhador.entities.Worker;
import composicaoDeClasses.trabalhador.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double workerSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.print("\nHow many contracts to this worker: ");
        int answer = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < answer; i++) {
            System.out.println("\nEnter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract hourContract = new HourContract(date, valuePerHour, hours);
            worker.addContract(hourContract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));

        sc.close();
    }
}
