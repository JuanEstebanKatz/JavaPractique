package com.jkatz.inicio;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    static int totalFamiliares = 3;
    static int caracterTomar = 2;
    public static void main(String[] args) {
        String dosUltimosCaracteres = "";
        String cadenaSalida = "";
     for (int i = 0; i<totalFamiliares;i++ )  {
         Scanner s = new Scanner(System.in);
         System.out.println("Ingrese el nombre del familiar:");
         String familiarName = s.nextLine();
         String inicial = String.valueOf(familiarName.charAt(caracterTomar-1)).toUpperCase();
         char[] aCaracteres = familiarName.toCharArray();
         for (int j = 0; j < aCaracteres.length; j++) {
             dosUltimosCaracteres = ((j==(aCaracteres.length-2) || j==(aCaracteres.length-1)) )? dosUltimosCaracteres+ aCaracteres[j]:"";
         }

         cadenaSalida= (i == totalFamiliares-1)?cadenaSalida + inicial+ "." + dosUltimosCaracteres : cadenaSalida + inicial+ "." + dosUltimosCaracteres +"_" ;
     }
        System.out.println(cadenaSalida);
    }
}
