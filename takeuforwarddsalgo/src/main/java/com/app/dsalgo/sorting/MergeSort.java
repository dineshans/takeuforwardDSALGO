package com.app.dsalgo.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2};
        mergeSort1(arr, arr.length);
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el));
    }

    public static void mergeSort1(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i-mid] = arr[i];
        }
        mergeSort1(l, mid);
        mergeSort1(r, n-mid);
        merge(arr, l, r, mid, n-mid);
    }

    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i =0, j =0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
}
