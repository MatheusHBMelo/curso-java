package programacaofuncionalAndExpressoesLambda.exerciciodefixacao.application;

import programacaofuncionalAndExpressoesLambda.exerciciodefixacao.entities.Employee;

import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            // Em ordem alfabética, o email dos funcionários cujo salário seja superior ao salario fornecido pelo user
            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .toList();
            System.out.println("Email of people whose salary is more than 2000.00:");
            emails.forEach(System.out::println);

            // Mostrar a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
            double sum = list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary of people whose name starts with 'M': $" + String.format("%.2f", sum) );
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
