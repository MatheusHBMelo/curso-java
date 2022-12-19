package data_horaAndDate_Calendar.dataHora;

import java.time.ZoneId;

public class ZoneIds {
    public static void main(String[] args) {
        // Mostrando a lista com os ZoneID's
        for (String zoneID: ZoneId.getAvailableZoneIds()){
            System.out.println(zoneID);
        }
    }
}
