package com.jkatz.lambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        // Siempre retorna un booleano
        Predicate<Integer> test = num ->num>10;
        boolean r = test.test(11);
        System.out.println(r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_USER"));

       // BiPredicate<String,String> t3 =(a,b)->a.equals(b);
        BiPredicate<String,String> t3 =String::equals;
        System.out.println(t3.test("Maruja", "PEPA"));

        User a = new User();
        a.setNombre("Cata");

        User b = new User();
        b.setNombre("Lupe");

        BiPredicate<User,User> t4 = (ua,ub) ->a.getNombre().equals(b.getNombre());

        System.out.println(t4.test(a,b));
    }

}
