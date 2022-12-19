package data_horaAndDate_Calendar.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
public class EstudoConversaoDeData {
    public static void main(String[] args) {
        // Data-hora global com timezone para LOCAL
        Instant data1 = Instant.parse("2001-07-21T13:37:00Z");
        // Com zone default
        LocalDate data1Local = LocalDate.ofInstant(data1, ZoneId.systemDefault());
        LocalDateTime data1LocalTime = LocalDateTime.ofInstant(data1, ZoneId.systemDefault());
        // Com zone de Portugal
        LocalDate data1Local2 = LocalDate.ofInstant(data1, ZoneId.of("Portugal"));
        LocalDateTime data1LocalTime2 = LocalDateTime.ofInstant(data1, ZoneId.of("Portugal"));

        System.out.println("Conversão LOCALDATA com zone Default: " + data1Local);
        System.out.println("Conversão LOCALDATA com zone Portugal: " + data1Local2);

        System.out.println("Conversão LOCALDATATIME com zone Default: " + data1LocalTime);
        System.out.println("Conversão LOCALDATATIME com zone Portugal: " + data1LocalTime2);

        System.out.println("-----------------------------------------------------------------------");

        // Obtendo dados de um data hora e time local
        LocalDate localdate1 = LocalDate.parse("2001-07-21");
        LocalDateTime localdatetime1 = LocalDateTime.parse("2001-07-21T13:37");

        // Dia
        System.out.println("LOCALDATE dia = " + localdate1.getDayOfMonth());
        System.out.println("LOCALDATETIME dia = " + localdatetime1.getDayOfMonth());
        // Mês
        System.out.println("LOCALDATE mes = " + localdate1.getMonthValue());
        System.out.println("LOCALDATETIME mes = " + localdatetime1.getMonthValue());
        // Ano
        System.out.println("LOCALDATE ano = " + localdate1.getYear());
        System.out.println("LOCALDATETIME ano = " + localdatetime1.getYear());
        // Hora
        System.out.println("LOCALDATETIME hora = " + localdatetime1.getHour());
        // Minuto
        System.out.println("LOCALDATETIME minuto = " + localdatetime1.getMinute());
        // Segundo
        System.out.println("LOCALDATETIME segundo = " + localdatetime1.getSecond());
    }
}
