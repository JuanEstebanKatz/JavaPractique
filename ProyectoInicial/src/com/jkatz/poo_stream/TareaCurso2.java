package com.jkatz.poo_stream;

import java.util.Arrays;
import java.util.function.Function;

public class TareaCurso2 {

    public static void main(String[] args) {
        //Recibe un arreglo de enteros y devuelve el mayor
        //Function<Integer[],Integer> calcMax = arreglo -> Arrays.stream(arreglo).peek(System.out::println).reduce(0,(e1,e2)->e1>e2?e1:e2);
        Function<Integer[],Integer> calcMax = arreglo -> Arrays.stream(arreglo).reduce(0,(e1,e2)->e1>e2?e1:e2);

        int respuesta =calcMax.apply(new Integer[]{1,45,15,18,85,95,100,-65,200});
        System.out.println("respuesta = " + respuesta);
    }


}
