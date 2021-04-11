package com.jkatz.appfacutras;

import com.jkatz.appfacutras.modelo.Cliente;
import com.jkatz.appfacutras.modelo.Factura;
import com.jkatz.appfacutras.modelo.ItemFactura;
import com.jkatz.appfacutras.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("3697-5");
        cliente.setNombre("Jkatz");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la Factura ");
        String desc = s.nextLine();
        Factura factura = new Factura( desc, cliente);
        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i =0; i<1;i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " +producto.getCodigo() + ": " );
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            ItemFactura itemFactura = new ItemFactura(s.nextInt(), producto);
            factura.addItemFactura(itemFactura);

            System.out.println(" ");
            s.nextLine();
        }

        System.out.println(factura.generarDetalle());

    }
}
