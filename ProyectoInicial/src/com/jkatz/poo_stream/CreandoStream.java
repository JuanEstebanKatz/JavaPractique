package com.jkatz.poo_stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CreandoStream {

    public static void main(String[] args) {

        AtomicInteger integer = new AtomicInteger(0);
        // creamos un flujo apartir de una información disponible....
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return integer.incrementAndGet();
        })
                .limit(5)
                .forEach(System.out::println);
    }
}
