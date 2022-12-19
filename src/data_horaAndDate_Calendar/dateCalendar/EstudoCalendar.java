package data_horaAndDate_Calendar.dateCalendar;

import java.util.Calendar;

public class EstudoCalendar {
    public static void main(String[] args) {
        // Data e hora sem timezone
        Calendar c = Calendar.getInstance();
        System.out.println("Data atual: " + c.getTime());

        // Capturas separadas de membros da data
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + (1 + c.get(Calendar.MONTH)));
        System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + c.get(Calendar.MINUTE));
        System.out.println("Segundo: " + c.get(Calendar.SECOND));

        // GetMinimum
        int m = c.getMinimum(Calendar.MONTH);
        System.out.println("Minimo numero de meses do ano: " + m);

        // GetMaximum
        int m2 = c.getMaximum(Calendar.MONTH);
        System.out.println("Maximo numero de meses do ano: " + (m2+1));

        // Add
        c.add(Calendar.MONTH, -2);
        System.out.println(c.getTime());
    }
}
