package com.jkatz.poo_colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println( hs.add("uno"));
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        boolean b =hs.add("tres");

        System.out.println(b);
    }
}
