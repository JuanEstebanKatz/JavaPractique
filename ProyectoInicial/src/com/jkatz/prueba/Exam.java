package com.jkatz.prueba;

public class Exam {

    static int[] myArray = {1,2,1,3,3,1,2,1,5,1};
    
    public static void main(String[] args) {
        int uno =0, dos=0 , tres =0, cuatro=0, cinco =0;
        for(int  i =0;i<myArray.length;i++){
           switch (myArray[i]){
               case 1: uno = uno+1;
               break;
               case 2: dos = dos +1;
               break;
               case 3: tres = tres +1;
               break;
               case 4: cuatro = cuatro +1;
               break;
               case 5: cinco  = cinco +1;
               break;
               default:
                   System.out.println("numeros fuera del trango solicitado");
                   break;
           }
        }
        System.out.println(" uno aparece = " + uno +"\n dos aparece "+dos+"\n tres aparece "+tres+"\n cuatro aparece "+ cuatro+"\n cinque aparece "+cinco);

        int numerosTotal [] ={uno,dos,tres,cuatro,cinco};

        for (int j=0;j<numerosTotal.length;j++){
            System.out.print(j+1 +": ");
            for(int k=0;k<numerosTotal[j];k++){
                System.out.print("*");
            }
            System.out.println("\n");
      }

    }
}
