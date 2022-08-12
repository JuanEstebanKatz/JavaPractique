package com.jkatz.poo_fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class EjemploDuration {

    public static void main(String[] args) {
        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(14).plusMinutes(58).plusDays(25);

        Duration lapsus = Duration.between(fecha1,fecha2);

        System.out.println("lapsus = " + lapsus);
        System.out.println("lapsus en dias  = " + lapsus.toDays());

        LocalDate ej1 = LocalDate.of(2022,8,11);
        ej1= ej1.withMonth(9);
        LocalDate ej2 = LocalDate.of(1991,3,5);

        Period periodoJk = Period.between(ej1,ej2);

        System.out.println("lapsusJk = " + periodoJk);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias",
                        ej2, ej1, periodoJk.getYears(), periodoJk.getMonths(), periodoJk.getDays());
    }
}
