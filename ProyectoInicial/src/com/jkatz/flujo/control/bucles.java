package com.jkatz.flujo.control;

public class bucles {

    public static void main(String[] args) {

     String frase= "tres tristres tigres tragan trigo en un trigal";
     String palabra = "trigo";

     char letra = 'g';
     int cantidad = 0;
        buscar:
        for (int i =0; i<frase.length();i++ ) {
            int k= i;
            for(int j =0; j<palabra.length();j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad ++;
            //System.out.println("cantidad = " + cantidad + ", i: " +i); aca sabemos el indice en el que se encontro T
        }
       System.out.println("Encontrado = " + cantidad + " Veces la palabra "+palabra);
    }

}
