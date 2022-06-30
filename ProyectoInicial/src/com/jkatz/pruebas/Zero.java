package com.jkatz.pruebas;

public class Zero {

    /**
     * @return the number that is closest to​​​​​​‌​​‌‌​‌​‌‌‌‌‌‌‌​​‌‌‌​​​​‌ zero
     */
    static int closestToZero(int[] ints) {
        int lower=0;
        if(ints ==null ||ints.length == 0){
            return 0;
        }
        for (int i = 0; i < ints.length; i++) {
          lower= Math.abs(ints[i])>Math.abs(ints[i+i])?Math.abs(ints[i+i]):Math.abs(ints[i]);
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] ints = { -9, 8, 2, -5, 7 };
        int result = Zero.closestToZero(ints);

        System.out.println(result);
    }
}
