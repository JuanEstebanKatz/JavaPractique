package com.jkatz.poo_stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterSingle {

    public static void main(String[] args) {
        Usuario usuario = Stream.of("Pato ortega","Paco Caca","Pepa pig","Pepe tocamelrruncho","Luis pope","Pepe lupiño")
               // .peek(e -> System.out.println(e))
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u->u.getId().equals(9))
                .findFirst().orElseGet(()->new Usuario("Jhon","jk"));

        //Optional <Usuario> usuario = nombres.findFirst();
        System.out.println(usuario);
    }
}
