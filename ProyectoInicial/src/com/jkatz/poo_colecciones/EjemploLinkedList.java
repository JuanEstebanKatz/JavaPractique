package com.jkatz.poo_colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> lk = new LinkedList<>();
        //System.out.println(al.size()+ ", el tamaño");
        //System.out.println("esta Vacia la lista = " + al.isEmpty());
        lk.add(new Alumno("Migue",4));
        lk.add(new Alumno("Juan",3));
        lk.add(new Alumno("Lupe",2));
        lk.add(new Alumno("Ber",1));
        lk.set(1,new Alumno("Ana",5));
        lk.add(3,new Alumno("Michis",4));

        System.out.println( lk);
        System.out.println("al = " + lk);
        lk.addLast(new Alumno("gloria",4));
        lk.addFirst(new Alumno("El fepe",5));

        System.out.println("lk = " + lk);
        System.out.println("Ultimo::: "+lk.peekLast());

        lk.remove(new Alumno("Ana",5));

        System.out.println(" =========== ");
        System.out.println(lk);

        ListIterator<Alumno> li = lk.listIterator();
        while (li.hasNext()){
            System.out.println("li.next() = " + li.next());
        }
        System.out.println(" =#################################### Previous " );
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
