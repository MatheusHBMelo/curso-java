package data_horaAndDate_Calendar.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EstudoCalculosComDataHora {
    public static void main(String[] args) {
        System.out.println("-------------------------LOCALDATE-------------------------");
        // Soma LocalDate
        LocalDate d1 = LocalDate.parse("2022-10-15");
        LocalDate result1 = d1.plusDays(5);
        System.out.println("d1 + 5 dias = " + result1);

        // Subtração LocalDate
        LocalDate d2 = LocalDate.parse("2022-10-27");
        LocalDate result2 = d2.minusDays(2);
        System.out.println("d2 - 2 dias = " + result2);

        System.out.println("\n-----------------------LOCALDATETIME-----------------------");

        // Soma LocalDateTime
        LocalDateTime r1 = LocalDateTime.parse("2022-10-15T10:00");
        LocalDateTime resulte1 = r1.plusDays(5).plusHours(6);
        System.out.println("r1 + 5 dias + 6 horas (2022-10-15T10:00) = " + resulte1);

        // Subtração LocalDateTime
        LocalDateTime r2 = LocalDateTime.parse("2022-10-15T10:00");
        LocalDateTime resulte2 = r2.minusDays(5).minusHours(5);
        System.out.println("r2 - 5 dias - 5 horas (2022-10-15T10:00) = " + resulte2);

        System.out.println("\n-------------------------INSTANT-------------------------");
        // Soma Instant
        Instant p1 = Instant.parse("2022-10-15T10:00:00Z");
        Instant resul1 = p1.plus(5, ChronoUnit.DAYS).plus(5, ChronoUnit.HOURS);
        System.out.println("p1 + 5 dias + 5 horas (2022-10-15T10:00:00Z) = " + resul1);

        // Subtração Instant
        Instant p2 = Instant.parse("2022-10-15T10:00:00Z");
        Instant resul2 = p2.minus(5, ChronoUnit.DAYS).minus(5, ChronoUnit.HOURS);
        System.out.println("p2 - 5 dias - 5 horas (2022-10-15T10:00:00Z) = " + resul2);
    }
}
