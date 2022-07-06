package com.jkatz.poo_interfaces;

public class EjemploImprenta {

    public static void main(String[] args) {
     Curriculum cv = new Curriculum("Santa Ana","Ingeniebrio","Resumen laboral.......***......");
     cv.addExperiencias("Java")
     .addExperiencias("Oracle")
     .addExperiencias("Full stack en Fit 2018 - 2019");

     Informe informe = new Informe("san Miguel", "Santa Ana", "Estudio de microservicios lupeño");

     Libro libro = new Libro("jkatz","Patrones de diseño", Genero.ACCION);;
     libro.addPagina( new Pagina("Patron Singleton"))
             .addPagina(new Pagina("Patron composite"))
             .addPagina(new Pagina("Patron fachada"));

     //Una interfaz con su metodo estatico...................
     Imprimible.imprimir(cv);
     Imprimible.imprimir(informe);
     Imprimible.imprimir(libro);

     //llamado de una clase anonima::: o al vuelo no se puede reutilizar
     Imprimible.imprimir(new Imprimible() {
         @Override
         public String imprimir() {
             return Imprimible.TEXTO_DEFAULT;
         }
     });
    }
}


