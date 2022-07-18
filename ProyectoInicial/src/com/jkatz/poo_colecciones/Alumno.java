package com.jkatz.poo_colecciones;

public class Alumno {

    private String nombre;
    private Integer nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " nota: "+ nota;
    }
}
