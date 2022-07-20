package com.jkatz.lambdas;

import com.jkatz.lambdas.Aritmetica;
import com.jkatz.lambdas.Calculadora;

import java.util.function.Function;

public class LambdaPersonalizada {

    public static void main(String[] args) {

        Aritmetica suma = (a,b)->a+b;
        Aritmetica resta = (a, b) ->a-b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10,5,suma));
        System.out.println(calculadora.computar(10,5,resta));

        // implementacion al vuelo
        System.out.println(calculadora.computar(10,14,(a,b)->a*b));

        System.out.println(calculadora.conBifunction(9,8,(a,b)->a/b));

        Function<String,String> fixString = a-> {
           return  a.replace(".","")
                   .replace(",","")
                   .replace(" ","")
                   .toUpperCase();

        };
        System.out.println(fixString.apply("El ernesto pereoz , . no lo .."));

        //calculadora.ajustarCadena("El Ernesto perezzz,,,, ajua",)
    }
}
