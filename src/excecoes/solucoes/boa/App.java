package excecoes.solucoes.boa;

import excecoes.solucoes.boa.models.entities.Reservation;
import excecoes.solucoes.boa.models.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Formatador de data constante
        final DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Numero do quarto
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            // Data de checkin
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf1);

            // Data de checkout
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf1);

            // Instanciando o objeto
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);

            // Data de atualização do checkin
            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkinUpdate = LocalDate.parse(sc.nextLine(), dtf1);

            // Data de atualização do checkout
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkoutUpdate = LocalDate.parse(sc.nextLine(), dtf1);

            // Chamando o metodo de atualizar data e retornando os dados da reserva atualizados
            reservation.updateDates(checkinUpdate, checkoutUpdate);
            System.out.println(reservation);
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Erro 02: Enter only numbers");
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
