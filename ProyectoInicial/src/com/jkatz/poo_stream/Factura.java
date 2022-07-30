package com.jkatz.poo_stream;

public class Factura {

    private String descripcion;
    private Usuario usuario;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura(String descripcion){
        this.descripcion = descripcion;

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
