package com.jkatz.poo_herencia;

public class Alumno  extends Persona {
    private String institucion;
    private double notaMath;
    private double notaHistoria;
    private double notaEspañol;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor....");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMath() {
        return notaMath;
    }

    public void setNotaMath(double notaMath) {
        this.notaMath = notaMath;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaEspañol() {
        return notaEspañol;
    }

    public void setNotaEspañol(double notaEspañol) {
        this.notaEspañol = notaEspañol;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + "soy un alumno.... mi nombre es:: " +getNombre();
    }
}
