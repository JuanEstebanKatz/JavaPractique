package com.jkatz.sobrecarga;

/**
 * para la sobrecarga no importa el tipo de retorno sino el tipo de parametros de entrada y la cantidad
 */
public class Sobrecarga {

       public int sumar(int a,int b){
           return a+b;
        }

    public float sumar(float x,int y){
        return x+y;
    }
    public int sumar (int a, int b, int c){
           return a + b+c;
    }
}
