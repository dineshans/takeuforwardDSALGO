package com.app.dsalgo.sorting;

import java.util.Arrays;

/* Adjacent sorting  - take first 2 elements and then compare */
public class BubbleSort {

    public static void main(String[] args) {
        //int[] arr = {15,9,64,50,42};
        int[] arr = {1,2,3,4,5,6};
        bubbleSort(arr);
    }

    /* Worst case = O(N^2)
    * Question - How to optimize complexity
    * if no swap done that means arrays is already sorted, means after 1st iteration break the loop
    * */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i>= 0; i--) {
            boolean flag = false;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Array is already sorted, breaking the loop");
                break;
            }
        }
        System.out.println("Sorted Arrays is : " + Arrays.toString(arr));
    }
}
