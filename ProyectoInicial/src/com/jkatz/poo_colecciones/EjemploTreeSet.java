package com.jkatz.poo_colecciones;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        //No permite primitivos dentro de <>..
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);
        Set<Integer> num = new TreeSet<>();

    }
}
