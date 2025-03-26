package com.app.dsalgo.array.basic;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] resultArr = leftRotateByOnePlace(arr);
        Arrays.stream(resultArr).forEach(e -> System.out.print(" " + e));
    }

    public static int[] leftRotateByOnePlace(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
