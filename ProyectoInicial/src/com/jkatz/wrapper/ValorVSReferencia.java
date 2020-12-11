package com.jkatz.wrapper;

/**
 * Los Wrapper son inmutables.
 */
public class ValorVSReferencia {

    public static void main(String[] args) {
        int i =10; // se pasa por valor
        int [] edad ={10 ,11, 15}; // por referencia

        System.out.println("iniciamos el valor de main con i: = " + i);
        for (int j =0; j<edad.length; j++){
            System.out.println("edad[j] = " + edad[j]);
        }
        System.out.println(" Antes de invocar al metodo Test-------------");
        test(i);
        System.out.println("Finaliza valor de i en Main con = " + i);
        System.out.println("Por ser primitivo el valor se muestra intacto ya que no es una referencia ");

        System.out.println("Despues de invocar el test");
        // apuntamos al mismo objeto por refencia.
        test(edad);
        for (int j =0; j<edad.length; j++){
            System.out.println("edad[j] = " + edad[j]);
        }

    }

    public static void test(int valor){
        System.out.println("Iniciamos el metodo con i: " +valor);
        valor = 35;
        System.out.println("valor modificado en test = " + valor);
    }
    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo con Test Version Arreglo");
        for (int j =0; j<edadArr.length; j++){
            edadArr[j]  +=20;
        }
        System.out.println("Finaliza metodo TEST ARREGLO PArametro");
    }
}
