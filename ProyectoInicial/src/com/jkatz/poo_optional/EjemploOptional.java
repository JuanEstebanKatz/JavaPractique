package com.jkatz.poo_optional;

import java.util.Optional;

public class EjemploOptional {
    
    public static void main(String[] args) {
        String nombre = "jkatz";
        Optional<String> opt = Optional.of(nombre);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        if(opt.isPresent()){
            System.out.println("Hola: " + opt.get());
        }

        opt.ifPresent( valor->{
            System.out.println("hola "+ valor);
        });

        nombre = "lupe";

        // Usar el of 100% seguros que no este nulo sino tiene valor
        opt = Optional.ofNullable(nombre);
        System.out.println(opt.isEmpty());
        opt.ifPresentOrElse(
                v-> System.out.println("Hi:: "+ v),
                ()-> System.out.println("No esta presente")
        );
    }
}
