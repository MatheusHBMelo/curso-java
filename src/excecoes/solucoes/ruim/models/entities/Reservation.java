package excecoes.solucoes.ruim.models.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public Integer duration(){
        // Descobrindo a quantidade de dias entre o checkout e o checkin
        Duration d1 = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return (int) d1.toDays();
    }

    public String updateDates(LocalDate checkinUpdate, LocalDate checkoutUpdate){
        // Data atual para validação da atualização da reserva
        LocalDate now = LocalDate.now();

        // Verificando se a data de checkin ou a data de checkout são do passado, ou seja, antes da data atual;
        if (checkinUpdate.isBefore(now) || checkoutUpdate.isBefore(now)){
            return "Reservation dates for update must be future dates.";
        } // Verificando possivel erro, caso o checkout não for depois do checkin
        if (!checkoutUpdate.isAfter(checkinUpdate)){
            return "Check-out date must be after check-in date.";
        }

        this.checkin = checkinUpdate;
        this.checkout = checkoutUpdate;

        return null;
    }

    @Override
    public String toString(){
        return "Reservation: "
                + roomNumber
                + ", check-in: "
                + dtf.format(checkin)
                + ", check-out: "
                + dtf.format(checkout)
                + ", "
                + duration()
                + " nights.";
    }
}
