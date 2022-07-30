package com.jkatz.poo_stream;

import java.util.stream.Stream;

public class FilterEmpty {

    public static void main(String[] args) {

        long cuenta = Stream.of("Pato ortega", "Paco Caca", "", "Pepa pig", "Pepe tocamelrruncho", "", "Pepe lupiño")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("total de Vacios:: " + cuenta);
    }
}
