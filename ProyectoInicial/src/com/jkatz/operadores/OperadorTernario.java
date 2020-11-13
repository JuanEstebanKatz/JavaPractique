package com.jkatz.operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
      //variable = condicion ?  si verdadero: si es falso;
      String variable = 7==5 ? "es verdadero fanbuesa":" es falso hambuerguesa";
        System.out.println("variable = " + variable);

        String estado = "";
        double math = 0.0;
        double ciencias = 0.0;
        double artes = 0.0;
        double promedio = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese nota para MAth de 0 a 5");
        math = scanner.nextDouble();
        System.out.println("ingrese nota para ciencias de 0 a 5");
        ciencias = scanner.nextDouble();
        System.out.println("ingrese nota para artes de 0 a 5");
        artes = scanner.nextDouble();

        promedio = (math + ciencias + artes)/3;

        estado = promedio >=3.0 ? "aprobado": "reprobado";
        System.out.println("estado = " + estado);
    }
}

