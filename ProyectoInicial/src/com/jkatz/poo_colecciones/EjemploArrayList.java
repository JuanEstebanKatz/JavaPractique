package com.jkatz.poo_colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al.size()+ ", el tamaño");
        System.out.println("esta Vacia la lista = " + al.isEmpty());
        al.add(new Alumno("Migue",4));
        al.add(new Alumno("Juan",3));
        al.add(new Alumno("Lupe",2));
        al.add(new Alumno("Ber",1));
        al.set(1,new Alumno("Ana",5));
        al.add(3,new Alumno("Michis",4));

        System.out.println( al);
        al.remove(3);
        System.out.println("al = " + al);
    }
}
