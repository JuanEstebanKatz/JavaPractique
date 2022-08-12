package com.jkatz.poo_fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTempo = LocalDateTime.now();
        System.out.println("fechaTempo = " + fechaTempo);

        fechaTempo = LocalDateTime.parse("2022-08-10T20:50:13");
        System.out.println("fechaTempo = " + fechaTempo);

        //Para ver la Inmutabilidad
        LocalDateTime fecha2 = fechaTempo.plusDays(2000);
        System.out.println("Fecha2::: "  + fecha2);
        System.out.println("fechaTempo = " + fechaTempo);

        String foramto1 = fechaTempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("foramto1 = " + foramto1);

        // para am coloco hh:mm:ss a si esta en mayuscula HH es para 24 hrs
        String formato2 = fechaTempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
        String formato3 = fechaTempo.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss "));
        System.out.println("formato2 = " + formato2);
        System.out.println("formato3 = " + formato3);
    }
}
