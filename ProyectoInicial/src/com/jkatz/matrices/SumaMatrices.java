package com.jkatz.matrices;

public class SumaMatrices {

    public static void main(String[] args) {

        int [][] a ={
                {1,2,3},
                {5,6,7},
                {9,10,11}

        };
        int [][] b ={
                {10,20,30},
                {50,60,70},
                {90,100,110}

        };

        int [][] suma = new int[3][3];

        for (int i =0; i<a.length;i++) {
            for (int j =0; j<a[i].length;j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i =0; i<suma.length;i++){
            for (int j =0; j<suma[i].length;j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
