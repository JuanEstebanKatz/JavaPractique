package com.jkatz.poo_optional;

import java.util.Optional;

public interface Repositorio <T>{

    Optional<Computador> filtrar(String nombre);
}
