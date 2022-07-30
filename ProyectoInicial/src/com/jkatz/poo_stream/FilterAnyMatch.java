package com.jkatz.poo_stream;

import java.util.stream.Stream;

public class FilterAnyMatch {

    public static void main(String[] args) {
        boolean existe = Stream.of("Pato ortega", "Paco Caca", "Pepa pig", "Pepe tocamelrruncho", "Luis pope", "Pepe lupiño")
                // .peek(e -> System.out.println(e))
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(9));

        //Optional <Usuario> usuario = nombres.findFirst();
        System.out.println(existe);
    }
}
