package com.jkatz.matrices;

public class BusquedaElemnto {
    public static void main(String[] args) {
        int [][] matrizElemntos ={
                {35,90,3,1991},
                {15,2020,10,5},
                {667,123,32678,1998}
        };
        int elementoBuscar = 15;
        boolean encontrado = false;

        /***
         * @author
         * primer ciclo revisa las filas luego columnas
         * con la etiqueta del primer for el break se sale del ciclo principal
         */
        int i;
        int j = 0;
       buscar: for(i = 0; i < matrizElemntos.length;i++){
            for(j = 0; j<matrizElemntos[i].length; j++){
               // encontrado = matrizElemntos[i][j]==elementoBuscar ? true: false;
                if(matrizElemntos[i][j]==elementoBuscar){
                    encontrado = true;
                 break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("elemento Encontrado = " + elementoBuscar + " En las coordenadas" +i +"," +j);
        }else{
            System.out.println("No se encontro elemento");
        }

    }
}
