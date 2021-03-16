package com.jkatz.array;

public class DesplazandoElementos {
    /**
     * @author jkatz
     * @param args
     * metodo para desplazar posicion de un arreglo n+1
     */
    public static void main(String[] args) {
       int[] arregloInicial = new int [10];
       
       for(int i=0; i<arregloInicial.length; i++){
           arregloInicial[i] = i+1;
       }
        int[] arreglonuevo = desplazarPosicion(arregloInicial);

       for (int element:arreglonuevo ) {
           System.out.println("element = " + element);
       }
    }

    public static int[] desplazarPosicion(int [] arreglo){
        int [] arregloNuevo = new int[arreglo.length];
        int ultimo = arreglo[arreglo.length-1];
        for (int j =0; j< arreglo.length; j++){
            if (j == 0){
                arregloNuevo[j] =ultimo;
            }else {
                arregloNuevo[j] = arreglo[j-1];
            }
        }
        return arregloNuevo;
    }
}
