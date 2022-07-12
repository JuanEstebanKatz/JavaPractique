package com.jkatz.poo_exepciones;

import javax.swing.*;

public class EjemploExepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador:");
        String numerador = JOptionPane.showInputDialog("ingrese un entero divisior o numerador:");
        int divisor;
        double division;
        try {
            // divisor = Integer.parseInt(value);            // division = cal.dividir(10,divisor);            // System.out.println("division = " + division);
            double division2 = cal.dividir(denominador, numerador);
            System.out.println("division2 = " + division2);
        }  catch (FormatoNumeroException f) {
            System.out.println("Se detecto una execpcion: ingrese solo numeros ");
            f.printStackTrace();
        } catch (DivisionPorCeroException ae) {
            JOptionPane.showMessageDialog(null, "la excepcion es " + ae.getMessage());
            main(args);
        } finally {
            // se utiliza para cerrar recursos.. finalizar una conexion a BD
            System.out.println("Se ejecuta siempre y es opcional ");
        }
        System.out.println("Continua el flujo del app....");

    }
}
