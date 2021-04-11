package com.jkatz.matrices;

public enum Color {
    ROJO ("Rojo"),
    BLANCO ("Blanco"),
    GRIS ("Gris"),
    NEGRO ("Negro"),
    AZUL( " Azul"),
    MORADO ("Morado"),
    NARANJA ("orange");

    private final String color;

    Color( String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
