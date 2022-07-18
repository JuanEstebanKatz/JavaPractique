package com.jkatz.poo_colecciones;

import java.util.*;

public class EjemploComparableComparator {

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Migue",4));
        sa.add(new Alumno("Juan",3));
        sa.add(new Alumno("Lupe",2));
        sa.add(new Alumno("Ber",1));
        sa.add(new Alumno("Ana",5));
        sa.add(new Alumno("Michis",4));

        //Collections.sort(sa);
        System.out.println(sa);
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println("Imprimiendo con iterador");
        sa.forEach(System.out::println);
    }
}
