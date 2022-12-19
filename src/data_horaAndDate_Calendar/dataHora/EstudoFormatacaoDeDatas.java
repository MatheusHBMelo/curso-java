package data_horaAndDate_Calendar.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EstudoFormatacaoDeDatas {
    public static void main(String[] args) {
        // Formatando um LOCALDATE para saída de texto escolhida
        LocalDate data1 = LocalDate.parse("2001-07-21");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data1 formatada = " + data1.format(fmt1));

        // Formatando um LOCALDATETIME para saída de texto escolhida
        LocalDateTime data2 = LocalDateTime.parse("2001-07-21T13:37");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data2 formatada = " + data2.format(fmt2));

        // Formatando um INSTANT para saída de texto escolhida
        Instant data3 = Instant.parse("2001-07-21T13:37:00Z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Data3 formatada = " + fmt3.format(data3));
    }
}
