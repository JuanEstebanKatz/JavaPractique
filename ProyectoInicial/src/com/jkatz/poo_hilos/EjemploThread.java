package com.jkatz.poo_hilos;

public class EjemploThread  extends  Thread {

    public EjemploThread (String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Se inicia el metodo run del Hilo" +getName());

        for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el Hiloooo" );
    }

}
