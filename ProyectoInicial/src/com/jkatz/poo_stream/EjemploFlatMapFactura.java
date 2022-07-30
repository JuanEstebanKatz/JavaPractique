package com.jkatz.poo_stream;

import java.util.Arrays;
import java.util.List;

public class EjemploFlatMapFactura {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("juan", "cas");
        Usuario u2 = new Usuario("migue", "cas");

        u1.addFactura(new Factura("Comprar cosas del ara"));
        u1.addFactura(new Factura("Comprar D1"));

        u2.addFactura(new Factura("Comprar Bicicleta GT"));
        u2.addFactura(new Factura("Comprar Redmi note 11"));

        List<Usuario> users = Arrays.asList(u1,u2);
        //Flujo de usuarios a flujo de las facturas de los usuarios
        users.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f ->
                        System.out.println(f.getDescripcion().
                                concat(" Cliente: ")
                                .concat(f.getUsuario().toString())));


        //Logica vieja para mostrar las facturas asociadas a los usuarios..
        /*for (Usuario us:users ) {
            for (Factura fac:us.getFacturas() ) {
                System.out.println(us.toString() + "::"+ fac.getDescripcion());
            }
        }*/



    }
}
