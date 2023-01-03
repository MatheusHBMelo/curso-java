package excecoes.solucoes.muitoRuim;

import excecoes.solucoes.muitoRuim.models.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf1);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf1);

        if (!checkout.isAfter(checkin)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkinUpdate = LocalDate.parse(sc.nextLine(), dtf1);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkoutUpdate = LocalDate.parse(sc.nextLine(), dtf1);

            LocalDate now = LocalDate.now();

            if (checkinUpdate.isBefore(now) || checkoutUpdate.isBefore(now)){
                System.out.println("\nError in reservation: Reservation dates for update must be future dates.");
            }else if (!checkoutUpdate.isAfter(checkinUpdate)){
                System.out.println("\nError in reservation: Check-out date must be after check-in date.");
            } else {
                reservation.updateDates(checkinUpdate, checkoutUpdate);
                System.out.println(reservation);
            }
        }
        sc.close();
    }
}
