package com.jkatz.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculadora {

    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);
    }

    public double conBifunction(double a, double b, BiFunction<Double,Double,Double> lam){
        return lam.apply(a,b);
    }

    public String ajustarCadena(String cadena, Function<String,String> fix){
        return fix.apply(cadena);
    }
}
