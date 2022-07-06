package com.jkatz.poo_herencia;

public class AlumnoInternational  extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternational(){
        System.out.println("Alumno: Inicializando constructor....");
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return  super.saludar()+ " soy estudiante del pais: " + getPais();
    }
}
