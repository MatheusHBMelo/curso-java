package data_horaAndDate_Calendar.dataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class EstudoInstanciacaoDataHora {
    public static void main(String[] args) {
        // Data LOCAL Atual
        LocalDate data1 = LocalDate.now();
        // Data e hora LOCAL Atual
        LocalDateTime data2 = LocalDateTime.now();
        // Data e hora GLOBAL atual
        Instant data3 = Instant.now();
        // Texto ISO 8601 para Data LOCAL
        LocalDate data4 = LocalDate.parse("2022-12-02");
        // Texto ISO 8601 para Data hora LOCAL
        LocalDateTime data5 = LocalDateTime.parse("2022-12-02T10:47");
        // Texto ISO 8601 para Data hora GLOBAL
        Instant data6 = Instant.parse("2022-12-02T10:53:15Z");
        // Texto ISO 8601 para Data hora GLOBAL com FUSO GMT
        Instant data7 = Instant.parse("2022-12-02T10:53:15-03:00");
        // dia-mes-ano em texto para Data LOCAL
        LocalDate data8 = LocalDate.of(2022, 12, 2);
        // dia-mes-ano-hora em texto para Data hora LOCAL
        LocalDateTime data9 = LocalDateTime.of(2022, 12, 2, 10, 58, 15);
        // Data LOCAL formatada
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data10 = LocalDate.parse("21/07/2001", fmt1);
        // Data hora LOCAL formatada
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data11 = LocalDateTime.parse("21/07/2001 13:37", fmt2);

        // Prints de teste da funções
        System.out.println("Local Date: " + data1);
        System.out.println("Local Date Time: " + data2);
        System.out.println("Global Date Time: " + data3);
        System.out.println("Text ISO 8601 para Local Date: " + data4);
        System.out.println("Text ISO 8601 para Local Date hora: " + data5);
        System.out.println("Text ISO 8601 para global Date hora: " + data6);
        System.out.println("Text ISO 8601 para global Date hora(GMT-3): " + data7);
        System.out.println("Texto (ano, mes, dia) para local Date: " + data8);
        System.out.println("Texto (ano, mes, dia, hora, min, seg) para local Date hora: " + data9);
        System.out.println("Local date formatado (dia/mes/ano): " + data10);
        System.out.println("Local date hora formatado (dia/mes/ano hora:minuto): " + data11);
    }
}
