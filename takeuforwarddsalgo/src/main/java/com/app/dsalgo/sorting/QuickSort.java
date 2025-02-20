package com.app.dsalgo.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el + " "));
        quickSort(arr, 0, arr.length-1);
        System.out.println();
        Arrays.stream(arr).forEach(el -> System.out.print(" " + el + " "));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
         int partitionIndex = getPartitionIndex(arr, low, high);
         quickSort(arr, low, partitionIndex-1);
         quickSort(arr, partitionIndex+1, high);
        }
    }

    public static int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
