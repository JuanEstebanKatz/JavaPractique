package com.jkatz.poo_stream;

import java.util.ArrayList;
import java.util.List;

public class TareaCurso4 {
    public static void main(String[] args) {
        //creo Lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1500,5));
        productos.add(new Producto(1700,3));
        productos.add(new Producto(1900,8));
        productos.add(new Producto(3800,3));
        productos.add(new Producto(5500,7));
        
        //double totalProduct = productos.stream().map(e->e.getPrecio()*e.getCantidad()).reduce(0d,(total, e)->total+=e);
        double totalProduct = productos.stream().map(e->e.getPrecio()*e.getCantidad()).reduce(0d,Double::sum);


        System.out.println("totalProduct = " + totalProduct);
    }
}
