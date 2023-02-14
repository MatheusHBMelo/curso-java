package herancaePolimorfismo.revisao.application;

import herancaePolimorfismo.revisao.model.Pessoa;
import herancaePolimorfismo.revisao.model.PessoaFisica;
import herancaePolimorfismo.revisao.model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        List<Pessoa> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTaxpayer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char resposta = sc.next().charAt(0);
            sc.nextLine();
            if (resposta == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double totalAnual = sc.nextDouble();
                sc.nextLine();
                System.out.print("Health expenditures: ");
                double gastosComSaude = sc.nextDouble();
                sc.nextLine();

                list.add(new PessoaFisica(name, totalAnual, gastosComSaude));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double totalAnual = sc.nextDouble();
                sc.nextLine();
                System.out.print("Number of employees: ");
                int numeroDeFuncionarios = sc.nextInt();
                sc.nextLine();

                list.add(new PessoaJuridica(name, totalAnual, numeroDeFuncionarios));
            }
        }

        double sum = 0.0;
        System.out.println("\nTAXES PAID:");
        for (Pessoa p: list) {
            System.out.println(p.getNome() + ": $" + String.format("%.2f", p.tax()));
            sum += p.tax();
        }
        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
