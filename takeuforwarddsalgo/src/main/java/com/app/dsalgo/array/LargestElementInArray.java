package com.app.dsalgo.array;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,2};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element in Arrays is : " + largest);
    }
}
