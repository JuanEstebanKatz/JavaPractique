package com.jkatz.wrapper;

import java.lang.reflect.Method;

public class WrapperNumericos {
    public static void main(String[] args) {

        // Boxing toma el valor de un objeto literal y lo convierte a Integer.
        Integer intObjeto = Integer.valueOf(325687);
        // Auto boxing de manera implicita:
        Integer intObjeto2= 32768;

        // Forma Implicita...
        int num = intObjeto2;
        System.out.println("num = " + num);
        //Forma Explicita
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        /// Acá vamos a tener una perdida de información
        Short aShort = intObjeto2.shortValue();
        System.out.println("aShort = " + aShort);

        /**
         * @author jkatz
         * tener cuidado con la conversion de objetos con mayor capacidad
         * a otros con menor capacidad ya que hay perdida de información.....
         * No hay problema al reves.
         * Se deben revisar los rangos.
         */

        ////////////////// Auto BOXING
        // de forma explicita los convertimos... estos numeros a Integer
        Integer [] enteros ={1,2,5,6,8,9,8};

        int suma=0;
        for (Integer i:enteros) {
            if(i.intValue() %2 ==0)
                suma += i.intValue();
        }
        System.out.println("suma = " + suma);

        for (Integer i:enteros) {
            if(i %2 ==0) // forma Implicita...... autoboxing al primitivo
                suma += i.intValue();
        }

        System.out.println("suma = " + suma);

        Integer numero = 130;
        Integer numero2= numero;

        System.out.println( "Son el mimso Objeto? "+ (numero == numero2));

        // si es mayor a 127 compara por el valor y no por la instancia.
        numero2 =130;
        // contiene el mismo valor pero otra instancia, a diferencia de los primitivos
        // que compara por valor y no por referencia.
        System.out.println( "Son el mimso Objeto? por referencia: "+ (numero == numero2));
        System.out.println("Contien el mismo valor ?: = " + (numero.equals(numero2)));
        System.out.println("Contien el mismo valor metodo 2 ?: = " + (numero.intValue()==numero2.intValue()));

        /**
         * AutoBoxing un prmitivo a clase wrapper
         * Unboxing de wraper a primitivo
         *
         * los booleanos se pueden comparar con el igual =
         */

        /// con Get Class puedo conocer metodos y paquetes de una clase su clase padre entre mas info.
        String texto = "hola que mais";
        Class strClass =texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}

