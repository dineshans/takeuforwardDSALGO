package com.app.dsalgo.sorting;

import java.util.Arrays;

/* Pick an element and check with next element and swap */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {13,89,65,900,67, 8};
        insertionSort(arr);

    }

    public static void insertionSort(int[] arr) {
        for (int i =0; i <=arr.length-1; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    Arrays.stream(arr).forEach(System.out::print);
    }
}
