package com.jkatz.poo_stream;

import java.util.stream.Stream;

public class FlapMapEjemplo {

    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato ortega","Paco Caca","Pepa pig","Pepe tocamelrruncho","Luis pope","Pepe lupiño")
               // .peek(e -> System.out.println(e))
        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap( u->{
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                });
               // .peek(System.out::println);
        nombres.forEach(System.out::println);
        //lista.forEach(System.out::println);
    }
}
