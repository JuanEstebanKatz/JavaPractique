package com.jkatz.fechas;

import javax.lang.model.SourceVersion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * La clase lee el archivo y lo convierte en un flujo de Bytes
 */
public class AsignarPropiedades {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);
            properties.setProperty("mi.propiedad.perzonalizada","Valor guardado en el systema");
            System.setProperties(properties);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.perzonalizada\") = " + ps.getProperty("mi.propiedad.perzonalizada"));
            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo de configuraciones " +e);
        }
    }
}
