package data_horaAndDate_Calendar.dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EstudoDuration {
    public static void main(String[] args) {
        // Duração com LocalDate
        LocalDate data1 = LocalDate.parse("1950-02-09");
        LocalDate data2 = LocalDate.parse("2001-07-21");
        Duration d1 = Duration.between(data1.atTime(0, 0), data2.atTime(0, 0));
        System.out.println("Data1 para Data2 em dias: " + d1.toDays());

        // Duração com LocalDateTime e Instant
        LocalDateTime data3 = LocalDateTime.parse("2022-12-04T09:00");
        LocalDateTime data4 = LocalDateTime.parse("2022-12-04T11:00");
        Duration d2 = Duration.between(data3, data4);
        System.out.println("data3 para data4 em horas: " + d2.toHours());

        Instant data5 = Instant.parse("2022-12-01T09:00:00Z");
        Instant data6 = Instant.parse("2022-12-04T13:30:19Z");
        Duration d3 = Duration.between(data5, data6);
        System.out.println("data5 para data6 em dias: " + d3.toDays());
        System.out.println("data5 para data6 em horas: " + d3.toHours());
        System.out.println("data5 para data6 em minutos: " + d3.toMinutes());
        System.out.println("data5 para data6 em segundos: " + d3.toSeconds());
    }
}
