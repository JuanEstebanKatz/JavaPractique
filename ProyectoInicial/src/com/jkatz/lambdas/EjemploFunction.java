package com.jkatz.lambdas;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    /**
     *
     * combinacion entre consumer y suplier que retorna
     * @param args
     */
    public static void main(String[] args) {

        //El primero es la entrada el segundo lo que sale
        Function<String,String> f1 = param ->"hola...."+param;
        String result = f1.apply("Barco");
        System.out.println("result = " + result);

        //Function<String, String> f2 = param ->param.toUpperCase();
        Function<String, String> f2 = String::toUpperCase;

        System.out.println(f2.apply("mi perrita"));

        // Esta recibe 2 argumentos

        BiFunction<String, String, String> f3 =(a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("Lupe","el migue cas"));
    }
}
