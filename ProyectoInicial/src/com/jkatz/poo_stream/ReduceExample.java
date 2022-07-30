package com.jkatz.poo_stream;

import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(5,10,15,20);

        //int resultado = numeros.reduce(0,(a,b)->a+b);
        int resultado = numeros.reduce(0,Integer::sum);
        System.out.println(resultado);
    }
}
