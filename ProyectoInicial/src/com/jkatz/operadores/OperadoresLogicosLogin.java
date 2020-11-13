package com.jkatz.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /* String [] userNames = new String[2];
        String [] passwords = new String[2];
        userNames[0] = "jkatz";
        passwords[0] = "123456";

        userNames[1] = "admin";
        passwords[1] = "admin";*/

        String [] userNames = {"jkatz","admin","mkatz"}; // Se declara de forma explicita con 3 elementos.
        String [] passwords = {"123456","admin","pipis"};

        Scanner scanner= new Scanner(System.in);
        System.out.println("ingresar el username");
        String u = scanner.next();
        System.out.println("Ingresar Pass");
        String p = scanner.next();

        boolean esAutenticado = false;

       // if ( user.equals(u) && pass.equals(p) || user2.equals(u) && pass2.equals(p) )
        for(int i =0; i<userNames.length;i++){
//            if(userNames[i].equals(u) && passwords[i].equals(p)){
//                esAutenticado= true;
//                break;
//            }
            esAutenticado = (userNames[i].equals(u) && passwords[i].equals(p) ? true:esAutenticado);
        }

        String mensaje= esAutenticado ?"Bienvenido ".concat(u).concat("!!"):"Username o contraseña incorrectos";

        System.out.println( mensaje);
/*        if(esAutenticado){
            System.out.println("Bienvenido ".concat(u).concat("!!"));
        }else{
            System.out.println("Username o contraseña incorrectos");
            System.out.println("Lo siento, requiere auth");
        }*/


    }
}
