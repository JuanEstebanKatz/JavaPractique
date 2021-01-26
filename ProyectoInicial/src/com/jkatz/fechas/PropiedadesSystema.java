package com.jkatz.fechas;

import java.util.Properties;

public class PropiedadesSystema {

    public static void main(String[] args) {
        String userName =  System.getProperty("user.name");
        String home =  System.getProperty("user.home");
        System.out.println("userName + Home= " + userName +" "+ home);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
