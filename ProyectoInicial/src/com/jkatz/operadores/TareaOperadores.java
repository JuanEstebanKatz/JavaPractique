package com.jkatz.operadores;

import java.util.Scanner;

public class TareaOperadores {

    public static void main(String[] args) {
        int numero1,numero2 =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero 1");
        numero1 = scanner.nextInt();
        System.out.println("ingrese numero 2");
        numero2 = scanner.nextInt();

      //  String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        if (numero1 > numero2) {
            System.out.println(numero2 + "," +numero1);
        } else {
            System.out.println(numero1 +","+ numero2);
        }
    }
}
