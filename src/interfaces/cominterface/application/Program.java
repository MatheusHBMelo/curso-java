package interfaces.cominterface.application;

import interfaces.cominterface.model.entities.CarRental;
import interfaces.cominterface.model.entities.Vehicle;
import interfaces.cominterface.model.services.BrazilTaxService;
import interfaces.cominterface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double priceperHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double priceperDay = sc.nextDouble();

        RentalService rentalService = new RentalService(priceperHour, priceperDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("\nFATURA:");
        System.out.println("Pagamento básico: " + String.format("R$%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("R$%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("R$%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
