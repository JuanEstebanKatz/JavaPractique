package com.jkatz.poo_interfaces;

public class Informe extends Hoja implements Imprimible{

    private final String autor;
    private final String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "+ autor
                + " Revisado por: " + revisor
                +"\n"+ this.contenido;
    }
}
