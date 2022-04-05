package com.jkatz.inicio;

public class Cadenas {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profe = "Juan Esteban katz";
        String curso2 = new String("Programacion Java");

        String resultados =curso.concat(profe);
        System.out.println(resultados);

        resultados.replace("a","A");
        System.out.println("resultado = " + resultados);

        boolean esigual =  curso==curso2;
        System.out.println("curso == curso2 = " + esigual);

        //comparamos su valor.
        esigual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esigual);

        // Para no crear objetos en memoria le asigna la misma referencia
        String curso3 = "Programacion Java";
        esigual = curso==curso3;
        System.out.println("curso == curso3 = " + esigual);

        ///////////////////////////////// Inmutabilidad///////////////

        String resultado= curso.concat(profe);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        // con expresion lambda, transform retorna una nueva instancia:
       String otroString = curso.transform(c -> {
            return  c + " con " + profe;
        });

        System.out.println("otroString = " + otroString);
        //System.out.println("curso = " + curso);

        ////////////////////////////////////////////////////
//        String a = "a";
//        String b = "b";
//        String c =  a;
//
//        StringBuilder stringBuilder = new StringBuilder(a);
//
//        long inicio = System.currentTimeMillis();
//        for (int i = 0; i<500; i++){
//            //c = c.concat(a).concat(b).concat("\n"); // 500=> 2ms
//            //c = c + a + b + "\n"; //500 => 24ms
//            stringBuilder.append(a).append(b).append("\n"); // 500 => 0ms
//        }
//        long fin = System.currentTimeMillis();
//        System.out.println(fin-inicio);
//        System.out.println("c = " + c);
//        System.out.println("stringBuilder = " + stringBuilder.toString());
        
//        String cursito = " ";
//        boolean esNulo = cursito ==null;
//        boolean esVacio = cursito.length()==0;
//        boolean esVacio2 = cursito.isEmpty();
//
//        // valida si no es nulo, no vacio ni blanco
//        boolean esBlanco = cursito.isBlank();
//        //System.out.println("esNulo = " + esNulo);
//        System.out.println("esBlanco = " + esBlanco);

        String nombre = "jk";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"jk\") = " + nombre.equals("jk"));
        
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\"b\") = " + trabalenguas.replace("a","b"));
        System.out.println("  trabalenguas  ".trim());
        ///////////////////////////////////////////////////////// Extension de archivo///////////

        String archivo= "alguna..imagen.pdf";
        int i = archivo.indexOf("."); // si el archivo contiene un punto falla la captrua de tomar la extension
        int j = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        //System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(j+1) = " + archivo.substring(j+1));

        ///////////// en un arrreglo de caracteres
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char [] arreglo = trabalenguas.toCharArray();
        for(int k=0;k<arreglo.length;k++){
            //System.out.println("arreglo = " + arreglo[k]); // pinta en linea vertical.
            System.out.print( arreglo[k]); // pinta en linea horizontal
        }
        System.out.println();
        //System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String [] arreglo2 = trabalenguas.split("a");
        for(int l=0;l<arreglo2.length;l++){
            System.out.println(arreglo2[l]);
        }
        String [] archivoArray = archivo.split("\\."); // escapar para indicar cual es
        int largo=archivoArray.length;
        for(int l=0;l<largo;l++){
            System.out.println(archivoArray[l]);
        }
        System.out.println("archivoArray = " + archivoArray[largo-1]);
    }

}
