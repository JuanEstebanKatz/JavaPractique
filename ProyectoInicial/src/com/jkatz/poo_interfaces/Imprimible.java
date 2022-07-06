package com.jkatz.poo_interfaces;

public interface Imprimible {

  /*  default String imprimir(){
        return "Imprimiendo un valor por defecto";
    }*/

    final static String TEXTO_DEFAULT= "Esto es un texto estatico de la interfazzzzzz";
    String imprimir();

    public static void imprimir(Imprimible imprimible) {
        System.out.println( imprimible.imprimir());
    }


}
