package com.jkatz.poo_fechas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeEjemplo {

    public static void main(String[] args) {
        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal,newYork);

        System.out.println("Hora de partida en Ny = " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);

        System.out.println("hora de llegada Madrid = " + zonaMadrid);
    }
}
