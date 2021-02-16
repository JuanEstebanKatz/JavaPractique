package com.jkatz.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Recorrido {

    public static void main(String[] args) {

      String [] productos = new String[6];

      productos[0]= "Casa 37";
      productos[1]= "Casa 38";
      productos[2]= "Mi A3 64 GB";
      productos[3]= "Fruver Santa Rana";
      productos[4]= "Villa Glanchos";
      productos[5]= "Hp Laptop 12GB Ram";

      Arrays.sort(productos);

      for( String prod: productos) {
          System.out.println("prod = " + prod);
      }

        System.out.println(" ########  ------   AHORA Usando Do While");

      int i =0;
      do{
          System.out.println("productos en el indice: " + i +": " + productos[i]);
          i++;
      }while(i< productos.length);

        arregloInversrso(productos);

        // esto hace el mismo resultado de lo anterior que dure como 1 hora matandome como pendejo....
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("\n");
      for(String newProd: productos){
          System.out.println("newProd = " + newProd);
      }

    }


    /**
     * Total 2 es una variable de control, justo en la mitad del recorrido se iguala con el indice y sale.
     * de lo contrario despues de la mitad el arreglo vuelve a quedar igual al original....
     * @param arreglo
     */
    public static void arregloInversrso(String [] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i< total2; i++){
            String valorAct = arreglo[i];
            String valorRemplazo = arreglo[total-1-i];
            arreglo[i] = valorRemplazo;
            System.out.println(arreglo[i]);
            arreglo[total-1-i] = valorAct;
            System.out.println(arreglo[total-1-i]);
            total2--;
        }
    }

}
