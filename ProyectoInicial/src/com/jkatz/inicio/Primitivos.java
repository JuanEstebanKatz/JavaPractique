package com.jkatz.inicio;

import javax.swing.*;

public class Primitivos {

    static float varFlotante;
    public static void main(String[] args) {

        byte numeroByte = -128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde a bites a: " + Byte.SIZE);
        System.out.println("Valor Maximo dum byte: " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde a bites a: " + Short.SIZE);
        System.out.println("Valor Maximo dum short: " + Short.MAX_VALUE);
        System.out.println("Valor Maximo dum short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroShort);
        System.out.println("Tipo Entero corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo Entero corresponde a bites a: " + Integer.SIZE);
        System.out.println("Valor Maximo dum Entero: " + Integer.MAX_VALUE);
        System.out.println("Valor Maximo dum Entero: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroShort);
        System.out.println("Tipo Long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo Long corresponde a bites a: " + Long.SIZE);
        System.out.println("Valor Maximo dum Long: " + Long.MAX_VALUE);
        System.out.println("Valor Maximo dum Long: " + Long.MIN_VALUE);

        // la nueva caracteristica de Var la crea por defecto como int.
        //utilizar alt + j, para seleccionar la misma variable y refactorizarla.
        // crt + d para duplicar linea..
        var numeroVar = 2147483648L;

        //////////////////////////////////////////Flotantes ///////////////////////////
        
        float realFloat = 2.13E-3F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("numeroLong = " + numeroShort);
        System.out.println("Tipo Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo Float corresponde a bites a: " + Float.SIZE);
        System.out.println("Valor Maximo dum Float: " + Float.MAX_VALUE);
        System.out.println("Valor Maximo dum Float: " + Float.MIN_VALUE);

        double  realDouble= 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("numeroLong = " + numeroShort);
        System.out.println("Tipo Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo Double corresponde a bites a: " + Double.SIZE);
        System.out.println("Valor Maximo dum Double: " + Double.MAX_VALUE);
        System.out.println("Valor Maximo dum Double: " + Double.MIN_VALUE);

       // float varFlotante =0.0f;
        System.out.println("varFlotante = " + varFlotante);
        
        char caracter ='\u0040';
        char caracterDecimal =64;

        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("caracter = " + caracter);
        System.out.println("caracterDecimal = " + caracterDecimal);

        System.out.println("uso del retroceso:" +retroceso+ retroceso + " borra los dos puntos") ;
        System.out.println("uso del tabulador:" +tabulador + " tabula") ;
        System.out.println("uso de la nueva:" +nuevaLinea + "linea") ;
        System.out.println("uso de la nueva:" +System.getProperty("line.separator") + "linea") ;
        System.out.println("retorno de carrito:" +retornoCarro + "carrito") ;

        System.out.println("caracterDecimal =  caracter: " + (caracterDecimal == caracter));
        System.out.println("Tipo Character corresponde en byte a: " + Character.BYTES);
        System.out.println("Tipo Character corresponde a bites a: " + Character.SIZE);
        System.out.println("Valor Maximo dum Character: " + Character.MAX_VALUE);
        System.out.println("Valor Maximo dum Character: " + Character.MIN_VALUE);
        
        /////////////////////////////////////////////////// Primitivos///////////////////////////////////////////
        boolean datoLogico = Boolean.TRUE; // otra manera extraña

        /////////////////// Sistemas numericos////////////

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese Numero Entero");
        int miNumero = 0;
        try{
            miNumero = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Numero Binario de:"+ miNumero + " = "+Integer.toBinaryString(miNumero);
        System.out.println(resultadoBinario);
        //anteponer 0b
        int numeroBinario = 0b111110100;

        //para Octal anteponer 0
        int numeroOctal = 036;
        String resultadoOctal = "Numero Octal de:"+ miNumero + " = "+ Integer.toOctalString(miNumero);
        System.out.println(resultadoOctal);

        //para Hexadecimal anteponer 0x
        int numeroHex = 0x1f4;
        String resultadoHxadecimal ="Numero Hexadecimal de:"+ miNumero + " = "+ Integer.toHexString(miNumero);
        System.out.println(resultadoHxadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje = mensaje + "\n"+ resultadoHxadecimal;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
