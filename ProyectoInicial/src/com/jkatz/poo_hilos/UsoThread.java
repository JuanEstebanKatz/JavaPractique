package com.jkatz.poo_hilos;

public class UsoThread {

    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new EjemploThread("jk");
        hilo.start();
       // Thread.sleep(1000);
        Thread hilo2 = new EjemploThread("Maria");
        hilo2.start();
        System.out.println(hilo.getState());
    }
}
