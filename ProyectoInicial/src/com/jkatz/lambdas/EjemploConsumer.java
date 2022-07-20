package com.jkatz.lambdas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        // envio por parametro de tipo del generico String
        Consumer<Date> consumidor = fecha->{
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        //cuando son dos argumentos o mas, esta obligado a usar parentesis
        BiConsumer<String,Integer> consumerBi = (nombre, edad)->{
            System.out.println(nombre + ", tiene"+ edad + " años!!");
        };
        //expresiones lambda con el metodo accept
        consumerBi.accept("Pepa",14);

        //Consumer<String> consumidor2 = mensaje -> System.out.println(mensaje);
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundooooo");

        List<String> miLista = Arrays.asList("jkatz","pepe","lupe","toños");
        miLista.forEach(consumidor2);

        User user = new User();

        /*
        BiConsumer<User,String> consumerUser = (persona,nombre)->{
            persona.setNombre(nombre);
        };*/

        BiConsumer<User,String> consumerUser = User::setNombre;
        consumerUser.accept(user,"Jclas");
        System.out.println("Nombre usuario "+ user.getNombre());

        Supplier<String> proveedor = ()->{
            return "Hola mundo lambda supplier";
        };

        System.out.println(proveedor.get());
    }
}
