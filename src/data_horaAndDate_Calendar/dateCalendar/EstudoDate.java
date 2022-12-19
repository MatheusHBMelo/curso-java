package data_horaAndDate_Calendar.dateCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class EstudoDate {
    public static void main(String[] args) {
        // Formato para data -> dd/MM/yyyy
        // Formato para data com hora -> dd/MM/yyyy HH:mm:ss

        // Instanciando um tipo Date com o horário atual
        Date date1 = new Date();
        System.out.println("Data horário atual (no format): " + date1);

        // Outras formas
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println(x3);
        System.out.println(x4);

        // Instanciando um tipo Date com o horário atual [OPÇÃO ALTERNATIVA]
        Date date1b = new Date(System.currentTimeMillis());
        System.out.println("\nData horário atual (no format) (alternative): " + date1b);

        // Instanciando um tipo Date com o horário e formatação e timezone padrão da maquina
        Date date2 = Date.from(Instant.parse("2022-12-06T10:43:45Z"));
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("\nData horário (with format) (timezone default GMT-3): " + sdf1.format(date2));

        // Somando unidades de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        // Obtendo uma unidade de tempo
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dd = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf5.format(dd));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(dd);
        int minutes = cal2.get(Calendar.MINUTE);
        int month = 1 + cal2.get(Calendar.MONTH);
        System.out.println("\nMinutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
