package com.jkatz.array;

public class Numeros {
    public static void main(String[] args) {

        int [] lNumeros = new int[10];
        int [] a = new int[10];

        for(int i = 0; i< lNumeros.length; i++){
            lNumeros[i] = i+1;
        }

        int aux = 0;
        for (int i =0; i<lNumeros.length -i; i++){
           // System.out.print(lNumeros[i] +" ");
          //  System.out.println(lNumeros[lNumeros.length-1-i]);
            a[aux++] = lNumeros[i];
            a[aux++] = lNumeros[lNumeros.length-1-i];
        }

        for (int j = 0; j< a.length;j++){
            System.out.println("a["+(j+1)+"] = " + a[j]);
        }
    }
}
