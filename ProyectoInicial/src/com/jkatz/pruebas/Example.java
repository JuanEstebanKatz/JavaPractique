package com.jkatz.pruebas;


///Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order. Example:Input: nums = [3,2,4], target = 6 Output: [1,2]
public class Example {


    public static void main(String[] args) {

        int[] myArray = new int[]{3, 2, 7, 4};
        int target = 7, index1 = 0, index2 = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j) {
                    break;
                } else {
                    if (myArray[i] + myArray[j] == target) {
                        index1 = i;
                        index2 = j;
                        System.out.println(index1 + ", " + index2);
                        return;
                    }
                }

            }

        }

    }

}
