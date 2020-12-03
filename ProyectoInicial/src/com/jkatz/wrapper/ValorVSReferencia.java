package com.jkatz.wrapper;

/**
 * Los Wrapper son inmutables.
 */
public class ValorVSReferencia {

    public static void main(String[] args) {
        int i =10; // se pasa por valor

        System.out.println("iniciamos el valor de main con i: = " + i);

        test(i);

        System.out.println("Finaliza valor de i en Main con = " + i);
        System.out.println("Por ser primitivo el valor se muestra intacto ya que no es una referencia ");

    }

    public static void test(int valor){
        System.out.println("Iniciamos el metodo test con i: " +valor);
        valor = 35;
        System.out.println("valor modificado en test = " + valor);
    }
}
