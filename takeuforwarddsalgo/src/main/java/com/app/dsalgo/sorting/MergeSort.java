package com.app.dsalgo.sorting;

import java.time.temporal.Temporal;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2};
        /*mergeSort1(arr, arr.length);
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el));*/

        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1, temp);
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


    // using third temp array
    public static void mergeSort(int[] arr, int low, int high, int[] temp) {
        int n = arr.length;
        if(low >= high) {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid, temp);
        mergeSort(arr, mid+1, high, temp);
        mergeArr(arr, low, mid, high, temp);
    }

    public static void mergeArr(int[] arr, int low, int mid, int high, int[] temp) {
        int left = low;
        int right = mid+1;
        int index = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[index++] = arr[left];
                left++;
            }
            else {
                temp[index++] = arr[right];
                right++;
            }
        }
        while(left <= mid) {
            temp[index++] = arr[left];
            left++;
        }
        while(right <= high) {
            temp[index++] = arr[right];
            right++;
        }
        for(int i = low; i <= high; i++) {
            arr[i] = temp[i-low];
        }
    }
}
