package com.jkatz.pruebas;

public class Challenge {

    public static String firstNonRepeatingLetter( String str ) {
        String result="";
        int count =0;
        if(str!="" && str!=null ){
            String lower = str.toLowerCase();
            char[] array = lower.toCharArray();

            //logic
            for (int i = 0; i < array.length; i++) {
                if(count==1)// Means is not repeat.
                    return String.valueOf(str.charAt(i-1)); //return de index of the first not repeat word.
                for(int j =0; j<array.length;j++) {
                    if(array[i]==array[j]){
                       count+=1; // exist the word at least once
                       if(count ==2){
                           count =0; //reset the counter
                           break; // is duplicated
                       }
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("LUpilla"));
    }
   
}
