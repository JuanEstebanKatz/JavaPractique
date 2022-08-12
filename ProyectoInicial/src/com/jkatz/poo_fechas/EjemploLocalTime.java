package com.jkatz.poo_fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalTime {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);

        LocalDate mañana= LocalDate.now().plusDays(1);
        //con local time trabajamos con hora
        System.out.println(mañana);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAnterior = LocalDate.of(2020,11,20).isBefore(LocalDate.parse("2021-11-14"));
        System.out.println("esbisiestoAntes = " + esAnterior);

        System.out.println("dia del año actual:::  "+ LocalDate.now().getDayOfYear());
        System.out.println("Era = " + fechaActual.getEra());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes Actual = " + mes);
        System.out.println("Numero del mes " +mes.getValue());
        System.out.println("Mes Español = " + mes.getDisplayName(TextStyle.FULL, new Locale("es","CO")) );

        LocalTime max = LocalTime.MAX;
        System.out.println("max = " + max);

        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);
    }
}
