package com.jkatz.matrices;

public class Cadenas {
    public static void main(String[] args) {
     //   String [][]nombres = new String[3][2];
        String [][]nombres ={ {"Pepe","Pepa"},{"Josefa","Paco"},{"Luca","Pancha"} };
//        nombres [0][0]= "Pepe";
//        nombres [0][1]= "Pepa";
//        nombres [1][0]= "Josefa";
//        nombres [1][1]= "Paco";
//        nombres [2][0]= "Luca";
//        nombres [2][1]= "Pancha";

        for (int i =0; i< nombres.length; i++){
            for (int j = 0;j<nombres[i].length; j++){
                System.out.print(nombres[i][j]+ "\t");
            }
            System.out.println("  " );
        }

        System.out.println(" Iterando For Each" );
        /**
         * usando el for each es mas limpio, pero solo para imprimir.
         * @autor jkatz
         */
        for (String[] fila:nombres ) {
            for (String nombre: fila ) {
                System.out.print(nombre + "\t");
            }
            System.out.println( );
        }
    }
}
