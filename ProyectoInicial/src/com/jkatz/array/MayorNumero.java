package com.jkatz.array;

import java.util.Scanner;

public class MayorNumero {

    public static void main(String[] args) {
        int[] a = new int [5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 5 Enteros");
        for ( int i = 0; i<a.length;i++){
            a[i] = s.nextInt();
        }
        int maximo = 0;
        /**
         * metodo jkatz
         */
//        for(int i = 0; i<a.length -1; i++){
//            maximo = (a[i]>a[i+1])? a[i] : a[i+1];
//        }
      //  System.out.println(" maximo elemento es " +maximo );
        /**
         * metodo profe
         */
        for(int i = 1; i<a.length ; i++){
           maximo = (a[maximo]>a[i])? maximo : i;
        }
        System.out.println("maximo = " + a[maximo]);
    }

}
