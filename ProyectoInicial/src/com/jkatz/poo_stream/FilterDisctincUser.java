package com.jkatz.poo_stream;

import java.util.stream.Stream;

public class FilterDisctincUser {

    public static void main(String[] args) {
        Stream<Usuario> usuario = Stream.of("Pato ortega","Paco Caca","Pepa pig","Pato ortega","Pepe tocamelrruncho","Luis pope","Pepe lupiño","Pato ortega")

                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
               // .filter(u->u.getNombre().equals("Pepe"));
        usuario.forEach(System.out::println);
    }
}
