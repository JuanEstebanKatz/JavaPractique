package com.jkatz.flujo.control;

import javax.swing.*;

public class Sentencias {

public static void main(String[] args) {

//    for (int i=0;i<20 ;i++ ) {
////        if(i>5){
////            break;
////        }
//    }
//  for (int i =1, j=10;i<j;i++,j--){
//      System.out.println(i+ "- " + j);
//  }
//
//    for (int i=0;i<20 ;i++ ) {
//        if( i%2 == 0){
//           continue;
//        }
//        System.out.println("i = " + i);
//    }

    // Clase ejemplo de uso de break y continue............

    String [] nombres = {"pepe","hugo","paco","lana","mary","lupe"};
    int count = nombres.length;
    for (int i =0; i<count; i++){
        if(nombres[i].equalsIgnoreCase("mary")||
           nombres[i].equalsIgnoreCase("pepe")){
            continue;
        }
        System.out.println(i + "-= " + nombres[i]);
    }

    String buscar = JOptionPane.showInputDialog("ingrese Nombre a Buscar como: \"Pepe\"");
    boolean encontrado = false;
    for (int i =0; i<count; i++){
        if(nombres[i].equalsIgnoreCase(buscar)){
            encontrado = true;
            break;
        }
    }
    if(encontrado)
        JOptionPane.showMessageDialog(null,"encontrado a : "+buscar);
    else
        JOptionPane.showMessageDialog(null,"No existe en el sistema");
}
}
