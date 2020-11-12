package com.jkatz.inicio;

public class ConversionTipos {
    
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "987556.43e-6";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logico = Boolean.parseBoolean(logicoStr);
        System.out.println("logico = " + logico);

        int otroNumeroInt = 100;
        String otroNumeroIntStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroIntStr = " + otroNumeroIntStr);

        String otroNumeroIntStr2 = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroIntStr2 = " + otroNumeroIntStr2);

        int i = 22768;
        short s =(short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char)i;
        System.out.println("b = " + b);
    }
}
