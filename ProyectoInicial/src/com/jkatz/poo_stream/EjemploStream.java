package com.jkatz.poo_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("pato","PAco","Pepa","Pepe");
       // nombres.forEach(System.out::println );

        //Apartir de un arreglo....
        String [] arr = {"Lupe","Paco","Pepa","Pepe"};
        Stream<String> nombres2 = Arrays.stream(arr);

        //Creando un Streambuilder
        Stream<String> apellidos = Stream.<String>builder()
                        .add("lopez")
                        .add("cas")
                        .add("roscones").build();

        apellidos.forEach(System.out::println);

    }
}
