package com.jkatz.poo_stream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato ortega","Paco Caca","Pepa pig","Pepe tocamelrruncho","Luis pope")
               // .peek(e -> System.out.println(e))
        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
        .map(user ->{
            String nombre = user.getNombre().toUpperCase();
            user.setNombre(nombre);
            return user;
        });
        List<Usuario> lista = nombres.collect(Collectors.toList());
        //nombres.forEach(System.out::println);
        lista.forEach(System.out::println);
    }
}
