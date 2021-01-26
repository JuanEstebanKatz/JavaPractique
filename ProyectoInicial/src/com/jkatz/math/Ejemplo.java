package com.jkatz.math;

import java.util.Random;

public class Ejemplo {
    /**
     * Esta clase es final no se puede heredar
     * sus metodos son estaticos
     * @param args
     */
    public static void main(String[] args) {
        int absoluto = Math.abs(-3333);
        System.out.println("absoluto = " + absoluto);
        
        // hacia arriba
        double techo = Math.ceil(3.6);
        System.out.println("techo = " + techo);

        // hacia arriba
        double piso = Math.floor(3.6);
        System.out.println("piso = " + piso);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        System.out.println("Math.sin(90) = " + Math.sin(90));
        
        double random = Math.random();
        random *=7;
        System.out.println("random = " + random);

        String[] colores = {"amarillo", "negro", "blue", "vermelhio"};
        double azar = Math.random();
        azar *= Math.floor( colores.length);
        System.out.println("Color escojido es: "+ colores[(int) azar]);

        Random random1 = new Random();
        int randomInt = random1.nextInt(7);
        System.out.println("randomInt = " + randomInt);
    }
}

