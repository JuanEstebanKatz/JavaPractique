package com.jkatz.poo_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum  extends Hoja implements Imprimible{

    private final String persona;
    private final String carrera;
    private final List<String> experiencia;

    public Curriculum(String persona, String carrera,String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculum addExperiencias(String exp) {
        experiencia.add(exp);
        return this; // encadenar el metodo
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for(String exp : experiencia){
           sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
