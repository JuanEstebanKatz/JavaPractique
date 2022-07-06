package com.jkatz.poo_herencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor....");
    }
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Soy el profe de: " + getAsignatura()+ "  mi nombre es: " +getNombre();
    }
}

