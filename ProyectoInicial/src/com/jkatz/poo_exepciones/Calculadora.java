package com.jkatz.poo_exepciones;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {
        if(divisor == 0){
            throw new DivisionPorCeroException("No se puede dividir por Cero..");
        }
        return numerador/(double)divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorCeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num,div);
        }catch (NumberFormatException nf){
            throw new FormatoNumeroException("debe ingresar solo numerico.....");
        }


    }
}
