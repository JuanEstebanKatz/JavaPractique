package com.jkatz.flujo.control;

public class SentenciaWhile {
    public static void main(String[] args) {
       boolean prueba = true;
       int i = 0;
       while(prueba){
           if(i==3){
               prueba=false;
           }
           i++;
           System.out.println("i = " + i);
       }

       int [] numeritos ={1,2,5,6,10,55,7,6};
       for(int num : numeritos ){
           System.out.println("num = " + num);
       }

       String [] nombres = {"pepe","hugo","paco","lana","mary","lupe"};
       for(String nom: nombres){
           System.out.println("nom = " + nom);
       }

       bule1:
       for ( i = 0;i<4;i++){
           System.out.println();
          for(int j = 0; j<4; j++){
              if(i==2){
                  continue bule1;
              }
              System.out.print("[ i = " + i + " ,j "+j +"]");
          }
       }

        System.out.println(" \n =====================================");
        etiqueta:
        for ( i = 0;i<4;i++){
            System.out.println();
            for(int j = 0; j<4; j++){
                if(i==2){
                    break etiqueta;
                }
                System.out.print("[ i = " + i + " ,j "+j +"]");
            }
        }

        System.out.println(" \n ???????????????=====================================");


        ciclo:
        for ( i = 1; i<=7 ; i++){
           int j=1;
            while( j<=8){
                if(i==6 || i ==7){
                    System.out.println("Descanzo el día " + i +" :) YUPIIIIIIII");
                    break ciclo;
                }
                System.out.println("Trabajo el dia: " + i + " a las horas "+j +" :( ");
                j ++;
            }
        }
    }
}
