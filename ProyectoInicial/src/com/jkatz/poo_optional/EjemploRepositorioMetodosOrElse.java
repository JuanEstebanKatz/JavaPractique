package com.jkatz.poo_optional;

public class EjemploRepositorioMetodosOrElse {

    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        Computador def = new Computador("Hp Omen", "LA012");

        // Este metodo es mas costoso porque siempre crea el objto def si o si..
        Computador pc = repo.filtrar("Afdsu").orElse(def);

        System.out.println(pc);

        //Aca puedo crear el objeto dentro de la lamda
        //Mejor usar el orElseGet..
        pc = repo.filtrar("mackbook").orElseGet(()->{
            return def;
        });

        System.out.println(pc);
    }
}
