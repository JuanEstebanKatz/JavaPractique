package com.jkatz.poo_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();
        persona.put(null,"ajua");
        persona.put(null,"asdfsadf");
        persona.put("nombre"," Juan");
        persona.put("apellido"," caste");
        persona.put("apellido"," resta");
        persona.put("mail"," jk@jk.co");
        persona.put("edad"," 31");

        System.out.println("persona = " + persona);
        
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);

        persona.remove("mail"," jk@jk.co");
        System.out.println(" =######$$$$$$$$$$$$$$$$$ ");
        System.out.println("persona = " + persona);

        /// REcorro las llave
        Set<String> llaves = persona.keySet();
        for (String k:llaves) {
            System.out.println("k = " + k);
        }
    }
}
