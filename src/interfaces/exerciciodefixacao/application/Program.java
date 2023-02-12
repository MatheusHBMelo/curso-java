package interfaces.exerciciodefixacao.application;

import interfaces.exerciciodefixacao.model.Contract;
import interfaces.exerciciodefixacao.model.Installment;
import interfaces.exerciciodefixacao.service.ContractService;
import interfaces.exerciciodefixacao.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();
        sc.nextLine();

        Contract contract = new Contract(numero, data, valorContrato);

        System.out.print("Número de parcelas: ");
        int numeroParcelas = sc.nextInt();
        sc.nextLine();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numeroParcelas);

        System.out.println("\nParcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
