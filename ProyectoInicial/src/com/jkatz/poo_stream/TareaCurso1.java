package com.jkatz.poo_stream;

import java.util.stream.IntStream;

public class TareaCurso1 {

    public static void main(String[] args) {

        double numeros = IntStream.range(1, 101)
                //Excluyo multiplos de 10
                .filter(e -> e % 10 !=0)
                //Dividir cada elemento en 2
                .mapToDouble(e->(double) e/2)
                //.peek(System.out::println)
               // .sum();
                // sumarlos y retornarlos
                .reduce(0,(a,e)->a+e);


        System.out.println("numeros = " + numeros);
    }
}
