package com.app.dsalgo.array.easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]
* Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]
* */
public class SortArray0And1And2 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 0, 0, 1, 0};
        sortArrays(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(" " + e));
        System.out.println();
        sortArrayBetterApproach(arr);

        int n = 6;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArrayUsingArrayList(list, n);
    }

    /* Dutch national flag algorithm
    *  Optimal approach - O(N)
    * */
    public static void sortArrays(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }

    public static void sortArrayUsingArrayList(ArrayList<Integer> arr, int n) {
        int low = 0; int mid = 0; int high = n-1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(mid);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                mid++;
                low++;
            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }

    }

    /*
    *  Better approach
    *  count o's, 1's & 2'nd
    * */
    public static void sortArrayBetterApproach(int[] arr) {
        System.out.println("Size of Arrays : " + arr.length);
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("Count of 0's is : " + count0);
        System.out.println("Count of 1's is : " + count1);
        System.out.println("Count of 2's is : " + count2);
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count1; i++) {
            arr[i] = 1;
        }
        for (int i = count1+count2; i < arr.length; i++) {
            arr[i] = 2;
        }
        Arrays.stream(arr).forEach(e -> System.out.print(" " + e));
    }


}
