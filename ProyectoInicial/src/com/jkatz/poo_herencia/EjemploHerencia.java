package com.jkatz.poo_herencia;

import com.jkatz.poo_herencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println(" =========================== creando la instancia de Alumno " );
        Alumno alumno = new Alumno();
       // alumno.nombre ="Migue"; // si el atributo es protejido le puedo asignar de forma directa
        alumno.setNombre("Migue");;
        alumno.setApellido("klatz");
        alumno.setNotaEspañol(3.7);
        alumno.setNotaHistoria(3.9);
        alumno.setNotaMath(4);
        alumno.setEmail("jkatz@ud.edu.do");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());

        //Alumno international
        System.out.println(" =========================== creando la instancia de Alumno  international" );
        AlumnoInternational international = new AlumnoInternational();
        international.setNombre("Petter");
        international.setApellido("glosing");
        international.setPais("Austria");
        international.setEdad(25);
        international.setInstitucion("UNAM");
        international.setNotaIdiomas(4.2);
        international.setNotaEspañol(3.3);
        international.setNotaMath(2.9);
        international.setEmail("international@ud.edu.co");

        System.out.println(international.getNombre()+
                " " + international.getApellido()+
                " " + international.getInstitucion()+
                " " + international.getPais());

        // El profe
        System.out.println(" =========================== creando la instancia de Profesor" );
        Profesor profesor = new Profesor();
        profesor.setNombre("El fepe");
        profesor.setApellido("luianm");
        profesor.setAsignatura("math");


        System.out.println("Profesor de "+ profesor.getAsignatura() + ": "+profesor.getNombre() +"--"+ profesor.getApellido());

        System.out.println(" =========================== ------------------------" );
        Class clase =  international.getClass();
        while(clase.getSuperclass()!=null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+ " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

        System.out.println(" =========================== ------------------------" );

        imprimir(alumno);
        imprimir(international);
        imprimir(profesor);
    }

    /**
     * se va imprimiendo de lo mas generico hacia lo particular
     * @param persona
     */
    public static void imprimir(Persona persona){
        System.out.println(" Imprimiendo datos tipos Persona........");
        System.out.println("nombre: " + persona.getNombre()
                           + ",apellido: "+ persona.getApellido()
                           + ", edad: "+ persona.getEdad()
                            +", email:"+ persona.getEmail());

        if(persona instanceof  Alumno){
            System.out.println(" Imprimiendo datos tipos Alumno........");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("((Alumno) persona).getNotaMath() = " + ((Alumno) persona).getNotaMath());
            System.out.println("((Alumno) persona).getNotaHistoria() = " + ((Alumno) persona).getNotaHistoria());
            System.out.println("((Alumno) persona).getNotaEspañol() = " + ((Alumno) persona).getNotaEspañol());

            if(persona instanceof  AlumnoInternational){
                System.out.println(" Imprimiendo datos tipos Alumno International........");
                System.out.println("((AlumnoInternational) persona).getPais() = " + ((AlumnoInternational) persona).getPais());
            }
        }

        if(persona instanceof Profesor){
            System.out.println(" Imprimiendo datos tipos Profesor ........");
            System.out.println("Asignatura: = " + ((Profesor) persona).getAsignatura());
        }
        System.out.println(" ===== Sobre escritura Saludar -----------------" );
        System.out.println(persona.saludar());
        System.out.println(" =========================== ------------------------" );

    }
}
