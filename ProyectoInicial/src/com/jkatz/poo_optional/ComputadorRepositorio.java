package com.jkatz.poo_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;


    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H",new Fabricante("intel"));
        Computador asus = new Computador("Asus Rock", "Strix512");
        asus.setProcesador(proc);
       // dataSource.add(new Computador("Asus Rock", "Strix512"));
        dataSource.add(asus);

        dataSource.add(new Computador("MackBook Pro", "MVC2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream().
                filter(c -> c.getNombre().toLowerCase()
                        .contains(nombre.toLowerCase()))
                        .findFirst();

       /* for (Computador c: dataSource ) {
            if(c.getNombre().equalsIgnoreCase(nombre))
                return Optional.of(c);
        }
        return Optional.empty();*/
    }
}
