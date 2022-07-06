package com.jkatz.poo_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List <Imprimible> paginas;
    private String autor;
    private String titulo;
    private  Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina (Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(autor).append("\n")
                .append("Genero: ").append(genero).append("\n");

        for(Imprimible hojita: paginas ){
            sb.append(hojita.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
