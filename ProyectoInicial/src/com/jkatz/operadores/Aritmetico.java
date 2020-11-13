package com.jkatz.operadores;

public class Aritmetico {

    public static void main(String[] args) {
        int i=5,j=4 , suma = i+j; // mismo tipo de variable en una linea

        System.out.println("suma = " + suma);
        System.out.println("i+j = " + i+j); // precede un string solo concatena amenos del parentesis
        
        int residuo = 13%6;
        System.out.println("residuo = " + residuo);
        
        i+=2;
        System.out.println("i = " + i);
        
        j -=9;
        System.out.println("j = " + j);
        
        j*=-66;
        System.out.println("j = " + j);
        
        String ejemplo = "select * from c";
        ejemplo +="where ana lup";
        ejemplo +=" and null";
        System.out.println("ejemplo = " + ejemplo);

        /////////////////////////Operadores Unarios para invertir el signo
        int k = -66;
        k =-k;
        System.out.println("k = " + k);
        ////////////Operadores Incrementales

        //pre incremento
        i=1;
        j= ++i; // j=2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post Incremento
        i=2;
        System.out.println("valor inicial de i= " + i);
        j= i++; // primero se asigna a la variable, luego se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j +"\n");

        // pre decremento
        i =3;
        j = --i; // i = i-1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j + "\n");

        // post decremento
        i =4;
        j = i--; // j = 4 primero se asigna, luego se decrementa
        System.out.println("i post = " + i);
        System.out.println("j post= " + j +"\n");

        //////////////Operadores Relacionales = == != < > <= >=
        i=3;
        byte l =7;
        float m = 127e-7f;
        double n = 2.1413e3;
        boolean ñ = false;

        boolean b1 = i==l&&m==n;
        System.out.println("el valor de b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i==j && m>n || ñ==false;
        System.out.println("valor de b3: = " + b3 +"\n");
        b3 = i==j && (m>n || ñ==false);
        System.out.println("valor de b3: = " + b3);

        boolean b4 = i==l || n<m && ñ==true; // el AND tiene prioridad sobre el OR
        System.out.println("b4 = " + b4);
        
    }
}
