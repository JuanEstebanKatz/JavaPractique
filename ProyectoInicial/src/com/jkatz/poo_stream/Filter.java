package com.jkatz.poo_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato ortega","Paco Caca","Pepa pig","Pepe tocamelrruncho","Luis pope","Pepe lupiño")
        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u->u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        //nombres.forEach(System.out::println);
        lista.forEach(System.out::println);
    }
}
