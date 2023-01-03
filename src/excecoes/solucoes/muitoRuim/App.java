package excecoes.solucoes.muitoRuim;

import excecoes.solucoes.muitoRuim.models.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Formatador de data constante
        final DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

        // Verificando possivel erro, caso o checkout não for depois do checkin
        if (!checkout.isAfter(checkin)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
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

            // Data atual para validação da atualização da reserva
            LocalDate now = LocalDate.now();

            // Verificando se a data de checkin ou a data de checkout são do passado, ou seja, antes da data atual;
            if (checkinUpdate.isBefore(now) || checkoutUpdate.isBefore(now)){
                System.out.println("\nError in reservation: Reservation dates for update must be future dates.");
            } // Verificando possivel erro, caso o checkout não for depois do checkin
            else if (!checkoutUpdate.isAfter(checkinUpdate)){
                System.out.println("\nError in reservation: Check-out date must be after check-in date.");
            }
            else {
                // Efetuando a atualização da data e retornando o objeto
                reservation.updateDates(checkinUpdate, checkoutUpdate);
                System.out.println(reservation);
            }
        }
        sc.close();
    }
}
