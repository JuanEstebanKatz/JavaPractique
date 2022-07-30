package com.jkatz.poo_optional;

public class Computador {

    private String nombre;
    private String modelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public Computador() {
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", modelo. "+ modelo;
    }
}