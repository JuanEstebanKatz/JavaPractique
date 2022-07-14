package com.jkatz.poo_colecciones;

import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicados {

    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Lenguado", "Atún", "Pejerrey","atún"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) { // cuando esta duplicado retorna falso..
                //System.out.println("Elemento duplicado:  " + pez);
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("unicos:: " + unicos);
        System.out.println("duplicados = " + duplicados);
    }
}
