package com.jkatz.poo_fechas;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TareaEdad {

    public static void main(String[] args) {

        String fechaInicial = JOptionPane.showInputDialog("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        LocalDate fechaNacimiento = LocalDate.parse(fechaInicial, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, actual);
        JOptionPane.showMessageDialog(null,"Han pasado\n" +periodo.getYears()+" Años \n"+ periodo.getMonths() + " Meses y \n"+ periodo.getDays()+" Dias");
    }
}
