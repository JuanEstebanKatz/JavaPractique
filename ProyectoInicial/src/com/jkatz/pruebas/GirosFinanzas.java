package com.jkatz.pruebas;

public class GirosFinanzas {
    // 2 elemntos sumados den 10
    // Quedo al peluchon....
    static int[] arrayNumeros={1,3,4,2,7,9};

    public static void main(String[] args) {
        int totalSuma=10;
     for (int i =0; i< arrayNumeros.length;i++){
         for (int j = 0; j < arrayNumeros.length; j++) {
             if (arrayNumeros[i]+arrayNumeros[j] ==totalSuma){
                 System.out.print(arrayNumeros[i]+ " ");
                 System.out.print(arrayNumeros[j]);
                 return;
             }
         }
     }
    }
}
