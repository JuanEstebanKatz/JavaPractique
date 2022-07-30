package com.jkatz.poo_stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDisctincUserSum {

    public static void main(String[] args) {
        IntStream largoNombres = Stream.of("Pato ortega", "Paco Caca", "Pepa pig", "Pato ortega", "Pepe tocamelrruncho", "Luis pope", "Pepe lupiño", "Pato ortega")
                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                //obtenemos el largo del nombre y del apellido de user a entero
                .mapToInt(n -> n.toString().length())
                .peek(System.out::println);
        // .filter(u->u.getNombre().equals("Pepe"));
        //largoNombres.forEach(System.out::println);
        // Para obtener todas las estadisticas que envuelve todas las estadisticas
        IntSummaryStatistics statistics = largoNombres.summaryStatistics();
        System.out.println("total: " + statistics.getSum());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Min: " + statistics.getMin());
    }
}
