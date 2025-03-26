package com.app.dsalgo.array.hard;


import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        long[] a = {1, 4, 5, 7};
        long[] b = {2, 3, 6};
        mergeTwoSortedArraysWithExtraSpace(a,b);
    }

    public static void mergeTwoSortedArraysWithExtraSpace(long []a, long []b) {
        int n = a.length;
        int m = b.length;
        long[] arr = new long[n+m];
        int left = 0;
        int right = 0;
        int index = 0;
        while(left < n && right < m) {
            if (a[left] <= b[right]) {
                arr[index++] = a[left++];
            }
            else {
                arr[index++] = b[right++];
            }
        }
        while (left < n) {
            arr[index++] = a[left++];
        }
        while (right < m) {
            arr[index] = b[right++];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < n) {
                a[i] = arr[i];
            }
            else {
                b[i-n] = arr[i];
            }
        }
        System.out.print("Element from Arrays A is : " + "[");
        Arrays.stream(a).forEach(e -> System.out.print(" " + e));
        System.out.print(" ]");
        System.out.println();
        System.out.print("Element from Arrays B is : " + "[");
        Arrays.stream(b).forEach(e -> System.out.print(" " + e));
        System.out.print(" ]");
    }




}
