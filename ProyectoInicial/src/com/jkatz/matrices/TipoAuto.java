package com.jkatz.matrices;

public enum TipoAuto {
    SEDAN ("Sedan", "Auto mediano",4),
    STATION_WAGON ("station","auto Grande",4);
//    PICK_UP,
//    COUPE,
//    CONVERTIBLE,
//    FURGON;
    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAuto(String nombre,  String descripcion, int numeroPuerta){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
