package com.jkatz.fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("date = " + date);

        //SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
        SimpleDateFormat df = new SimpleDateFormat(" EEEE dd 'de' MMMM YYYY");
        String fechaStr = df.format(date);

        System.out.println("fechaStr = " + fechaStr);
        long j =0;
        for(int i =0; i<10000000; i++){
            j +=i;
        }

        Date fechaFin = new Date();
        long tiempoFinal = fechaFin.getTime() - date.getTime();
        System.out.println("tiempo Transcurrido en el FOR = " + tiempoFinal);

        Calendar calendario = Calendar.getInstance();
        calendario.set(1969,Calendar.DECEMBER,31,19,31);
        Date fecha2 = calendario.getTime();
        System.out.println("calendario = " + fecha2);
    }
}
