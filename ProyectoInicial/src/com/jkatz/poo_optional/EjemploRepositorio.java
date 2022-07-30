package com.jkatz.poo_optional;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String[] args) {
        Repositorio<Computador> repo = new ComputadorRepositorio();

        repo.filtrar("Asus")
                .ifPresentOrElse(System.out::println, () -> System.out.println("No se encontro el modelo"));

       //Optional <Computador> pc = repo.filtrar("Asus rock");
       // pc.ifPresentOrElse(e -> e.toString(), ()-> System.out.println("noooo"));
    }
}
