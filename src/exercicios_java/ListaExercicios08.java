package exercicios_java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ListaExercicios08 {
    public static void main(String[] args) {
        /*Exercicio 01
        Crie três variaveis, uma local com apenas data, uma local com data e hora e uma global, ambas capturando o horário atual e imprima

        Padrão ISO 8601
         */
        LocalDate localdate01 = LocalDate.now();
        LocalDateTime localdatetime01 = LocalDateTime.now();
        Instant instant01 = Instant.now();
        System.out.println("Local Date 01 = " + localdate01);
        System.out.println("Local Date Time 01 = " + localdatetime01);
        System.out.println("Instant 01 = " + instant01);

        /* Exercicio 02
        Crie uma variavel local para armazenar uma data e imprima a mesma

        Padrão ISO 8601
         */
        LocalDate localdate02 = LocalDate.parse("2022-12-05");
        System.out.println("\nLocal Date 02 = " + localdate02);

        /* Exercicio 03
        Crie uma variavel local para armazenar uma data com hora, minuto e segundo e imprima a mesma

        Padrão ISO 8601
         */
        LocalDateTime localdatetime02 = LocalDateTime.parse("2022-12-05T10:52:33");
        System.out.println("\nLocal Date Time 02 = " + localdatetime02);

        /* Exercicio 04
        Crie uma variavel local para armazenar uma data com hora, minuto, segundo e milesimo e imprima a mesma

        Padrão ISO 8601
         */
        LocalDateTime localdatetime03 = LocalDateTime.parse("2022-12-05T10:54:12.123456");
        System.out.println("\nLocal Date Time 03 = " + localdatetime03);

        /* Exercicio 05
        Crie uma variavel GLOBAL para armazenar uma data com hora, minuto e segundo e imprima a mesma

        Padrão ISO 8601
         */
        Instant instant02 = Instant.parse("2022-12-05T10:56:10Z");
        System.out.println("\nInstant 02 = " + instant02);

        /* Exercicio 06
        Crie uma variavel GLOBAL para armazenar uma data com hora, minuto, segundo e milesimo e imprima a mesma

        Padrão ISO 8601
         */
        Instant instant03 = Instant.parse("2022-12-05T10:57:13.12345Z");
        System.out.println("\nInstant 03 = " + instant03);

        /* Exercicio 07
        Crie uma variavel GLOBAL para armazenar uma data com hora, minuto, segundo e fuso GMT-3 e imprima a mesma

        Padrão ISO 8601
         */
        Instant instant04 = Instant.parse("2022-12-05T10:58:19-03:00");
        System.out.println("\nInstant 04 = " + instant04);

        /* Exercicio 08
        Crie uma data, e uma datahora que recebe informações separadas Ex: {dia, mes, ano, hora} forme uma data e imprima
         */
        LocalDate localdate03 = LocalDate.of(2022, 12, 5);
        LocalDateTime localdatetime04 = LocalDateTime.of(2022, 12, 5, 11, 0);
        System.out.println("\nLocal Date 03 = " + localdate03);
        System.out.println("Local Date Time 04 = " + localdatetime04);

        /* Exercicio 09
        Crie três variaveis, uma local com data, uma local com datahora e uma global, receba texto, formate e transforme em data
         */
        LocalDate localdate04 = LocalDate.parse("2022-12-05");
        LocalDateTime localdatetime05 = LocalDateTime.parse("2022-12-05T11:04:00");
        Instant instant05 = Instant.parse("2022-12-05T11:04:00.1234Z");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS").withZone(ZoneId.systemDefault());
        System.out.println("\nLocal Date 04 = " + localdate04.format(dtf1));
        System.out.println("Local Date Time 05 = " + localdatetime05.format(dtf2));
        System.out.println("Instant 05 = " + dtf3.format(instant05));

        /* Exercicio 10
        Crie três variaveis globais, formate-nas e imprima ambas
         */
        Instant instant06 = Instant.parse("2001-07-21T13:37:00Z");
        Instant instant07 = Instant.parse("2010-03-18T23:57:00Z");
        Instant instant08 = Instant.parse("2009-05-04T22:17:00Z");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println("\nInstant 06 = " + dtf4.format(instant06));
        System.out.println("Instant 07 = " + dtf4.format(instant07));
        System.out.println("Instant 08 = " + dtf4.format(instant08));

        /* Exercicio 11
        Crie três data globais default e converta ambas para datas locais e imprima
         */
        Instant instant09 = Instant.parse("2001-07-21T13:37:00Z");
        Instant instant10 = Instant.parse("2010-03-18T23:57:00Z");
        Instant instant11 = Instant.parse("2009-05-04T22:17:00Z");
        LocalDate localdate05 = LocalDate.ofInstant(instant09, ZoneId.systemDefault());
        LocalDate localdate06 = LocalDate.ofInstant(instant10, ZoneId.systemDefault());
        LocalDate localdate07 = LocalDate.ofInstant(instant11, ZoneId.systemDefault());
        System.out.println("\nLocal Date 05 = " + localdate05);
        System.out.println("Local Date 06 = " + localdate06);
        System.out.println("Local Date 07 = " + localdate07);

        /* Exercicio 12
        Crie três data globais como zonas diferentes e converta ambas para datas locais e imprima
         */
        Instant instant12 = Instant.parse("2001-07-21T15:00:00Z");
        Instant instant13 = Instant.parse("2010-03-18T15:00:00Z");
        Instant instant14 = Instant.parse("2009-05-04T15:00:00Z");
        LocalDateTime localdatetime06 = LocalDateTime.ofInstant(instant12, ZoneId.of("Portugal"));
        LocalDateTime localdatetime07 = LocalDateTime.ofInstant(instant13, ZoneId.of("America/Sao_Paulo"));
        LocalDateTime localdatetime08 = LocalDateTime.ofInstant(instant14, ZoneId.of("Australia/Sydney"));
        System.out.println("\nLocal Date Time 06 = " + localdatetime06);
        System.out.println("Local Date Time 07 = " + localdatetime07);
        System.out.println("Local Date Time 08 = " + localdatetime08);

        /* Exercicio 13
        Crie uma data local e obtenha dados do dia, mes e ano e imprima
         */
        LocalDate localdate08 = LocalDate.parse("2022-12-05");
        System.out.println("\nLocal Date 08 DIA = " + localdate08.getDayOfMonth());
        System.out.println("Local Date 08 MES = " + localdate08.getMonthValue());
        System.out.println("Local Date 08 ANO = " + localdate08.getYear());

        /* Exercicio 14
        Crie uma data-hora local e obtenha dados do dia, mes, ano, hora, minuto e segundo e imprima
         */
        LocalDateTime localdatetime09 = LocalDateTime.parse("2010-03-18T23:33:00");
        System.out.println("\nLocal Date Time 09 DIA = " + localdatetime09.getDayOfMonth());
        System.out.println("Local Date Time 09 MES = " + localdatetime09.getMonthValue());
        System.out.println("Local Date Time 09 ANO = " + localdatetime09.getYear());
        System.out.println("Local Date Time 09 HORA = " + localdatetime09.getHour());
        System.out.println("Local Date Time 09 MINUTO = " + localdatetime09.getMinute());
        System.out.println("Local Date Time 09 SEGUNDO = " + localdatetime09.getSecond());

        /* Exercicio 15
        Crie um par para 3 datas (data, datahora, global) e realize operações de soma entre as datas, imprima no final
         */
        LocalDate localdate09 = LocalDate.parse("2001-07-21");
        LocalDate localdate10 = localdate09.plusYears(5);
        LocalDateTime localdatetime10 = LocalDateTime.parse("2014-08-28T10:30:20");
        LocalDateTime localdatetime11 = localdatetime10.plusMinutes(30);
        Instant instant15 = Instant.parse("2010-01-08T15:30:20Z");
        Instant instant16 = instant15.plus(40, ChronoUnit.SECONDS);
        System.out.println("\n2001-07-21 + 5 years = " + localdate10);
        System.out.println("2014-08-28T10:30:20 + 30 minutes = " + localdatetime11);
        System.out.println("2010-01-08T15:30:20Z + 40 seconds = " + instant16);

        /* Exercicio 16
        Crie um par para 3 datas (data, datahora, global) e realize operações de subtração entre as datas, imprima no final
         */
        LocalDate localdate11 = LocalDate.parse("2001-07-21");
        LocalDate localdate12 = localdate11.minusYears(5);
        LocalDateTime localdatetime12 = LocalDateTime.parse("2014-08-28T10:30:20");
        LocalDateTime localdatetime13 = localdatetime12.minusMinutes(30);
        Instant instant17 = Instant.parse("2010-01-08T15:30:20Z");
        Instant instant18 = instant17.minus(40, ChronoUnit.SECONDS);
        System.out.println("\n2001-07-21 - 5 years = " + localdate12);
        System.out.println("2014-08-28T10:30:20 - 30 minutes = " + localdatetime13);
        System.out.println("2010-01-08T15:30:20Z - 40 seconds = " + instant18);

        /* Exercicio 17
        Crie uma variavel local date de referencia e mais 3 de comparação, compara a duração entre todas;
         */
        LocalDate localdate13 = LocalDate.parse("2001-07-21");
        LocalDate localdate14 = LocalDate.parse("1977-05-23");
        LocalDate localdate15 = LocalDate.parse("1978-05-13");
        LocalDate localdate16 = LocalDate.parse("2010-03-18");
        Duration drt1 = Duration.between(localdate13.atTime(0,0), localdate14.atTime(0,0));
        Duration drt2 = Duration.between(localdate13.atTime(0,0), localdate15.atTime(0,0));
        Duration drt3 = Duration.between(localdate13.atTime(0,0), localdate16.atTime(0,0));
        System.out.println("\nDuration 1 = " + drt1.toDays());
        System.out.println("Duration 2 = " + drt2.toDays());
        System.out.println("Duration 3 = " + drt3.toDays());

        /* Exercicio 18
        Crie uma variavel local date time de referencia e mais 3 de comparação, compara a duração entre todas;
         */
        LocalDateTime localdatetime14 = LocalDateTime.parse("2001-07-21T10:00:00");
        LocalDateTime localdatetime15 = LocalDateTime.parse("1977-05-23T15:20:00");
        LocalDateTime localdatetime16 = LocalDateTime.parse("1978-05-13T20:00:00");
        LocalDateTime localdatetime17 = LocalDateTime.parse("2010-03-18T18:30:00");
        Duration drt4 = Duration.between(localdatetime14, localdatetime15);
        Duration drt5 = Duration.between(localdatetime14, localdatetime16);
        Duration drt6 = Duration.between(localdatetime14, localdatetime17);
        System.out.println("\nDuration 4 = " + drt4.toHours());
        System.out.println("Duration 5 = " + drt5.toHours());
        System.out.println("Duration 6 = " + drt6.toMinutes());

        /* Exercicio 19
        Crie uma variavel global de referencia e mais 3 de comparação, compare a duração entre todas;
         */
        Instant instant19 = Instant.parse("2001-07-21T10:00:00Z");
        Instant instant20 = Instant.parse("1977-05-23T15:20:00Z");
        Instant instant21 = Instant.parse("1978-05-13T20:00:00Z");
        Instant instant22 = Instant.parse("2010-03-18T18:30:00Z");
        Duration drt7 = Duration.between(instant19, instant20);
        Duration drt8 = Duration.between(instant19, instant21);
        Duration drt9 = Duration.between(instant19, instant22);
        System.out.println("\nDuration 7 = " + drt7.toDays());
        System.out.println("Duration 8 = " + drt8.toDays());
        System.out.println("Duration 9 = " + drt9.toDays());
    }
}
