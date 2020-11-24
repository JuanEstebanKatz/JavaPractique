package com.jkatz.prueba;

public class Exam2 {
    static int[] myArray = {2,3,5,9,7,7,8,8,9,4,4};

    public static void main(String[] args) {
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0;

        for (int i = 0; i < myArray.length; i++) {
            switch (myArray[i]) {
                case 1:
                    uno = uno + 1;
                    break;
                case 2:
                    dos = dos + 1;
                    break;
                case 3:
                    tres = tres + 1;
                    break;
                case 4:
                    cuatro = cuatro + 1;
                    break;
                case 5:
                    cinco = cinco + 1;
                    break;
                case 6:
                    seis += 1;
                    break;
                case 7:
                    siete += 1;
                    break;
                case 8:
                    ocho += 1;
                    break;
                case 9:
                    nueve += 1;
                    break;
                default:
                    System.out.println("numeros fuera del trango solicitado");
                    break;
            }
        }
        System.out.println(" uno aparece " + uno +"\n dos aparece "+dos+"\n tres aparece "+tres+"\n cuatro aparece "+ cuatro+"\n cinque aparece "+cinco
               +"\n seis aparece "+ seis+"\n siete aparece "+ siete+"\n ocho aparece "+ ocho + "\n nueve aparece "+nueve);

        int [] ocurrencias ={uno,dos,tres,cuatro,cinco, seis, siete,ocho,nueve};
        int masOcurrenteNumeroVeces=0;
        int posicionNumeroOcurrente =0;

        for(int i=0;i<ocurrencias.length; i++ ){
            posicionNumeroOcurrente =(ocurrencias[i]>masOcurrenteNumeroVeces)?i:posicionNumeroOcurrente;
            masOcurrenteNumeroVeces =(ocurrencias[i]>masOcurrenteNumeroVeces)?ocurrencias[i]:masOcurrenteNumeroVeces;
            System.out.println("i = " + i);
            System.out.println("posicionNumeroOcurrente = " + posicionNumeroOcurrente);
            System.out.println("masOcurrenteNumeroVeces = " + masOcurrenteNumeroVeces);

        }
        System.out.println("Longest: " + masOcurrenteNumeroVeces);
        System.out.println("posicionNumeroOcurrente más uno = " + (posicionNumeroOcurrente+1));
     //  System.out.println("Numero: " + );

    }
}
