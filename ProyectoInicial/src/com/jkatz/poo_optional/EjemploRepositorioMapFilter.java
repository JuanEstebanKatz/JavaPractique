package com.jkatz.poo_optional;

public class EjemploRepositorioMapFilter {

    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        Computador def = new Computador("Hp Omen", "LA012");


        String f = repo.filtrar("asus")
               // .map(c -> c.getProcesador())
                // Si el metodo devuelve un opcional usar flatMap si no usar Map
                .map(Computador::getProcesador)
                //Solo los que tengan como fabricante Intelllll
                .filter(fa->"intel".equalsIgnoreCase(fa.getNombre()))
                .map(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);
    }
}
