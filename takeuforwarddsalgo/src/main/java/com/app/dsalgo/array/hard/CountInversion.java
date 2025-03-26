package com.app.dsalgo.array.hard;

public class CountInversion {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        int result = numberOfInversions(arr, arr.length);
        System.out.println("Total inversion count is : " + result);
    }


    public static int numberOfInversions(int []a, int n) {
        int[] temp = new int[n];
        return mergeSort(a, 0, n-1, temp);
    }

    public static int mergeSort(int[] arr, int low, int high, int[] temp) {
       int inversionCount = 0;

        if(low >= high) {
            return inversionCount;
        }
        int mid = (low+high)/2;
        inversionCount += mergeSort(arr, low, mid, temp);
        inversionCount += mergeSort(arr, mid+1, high, temp);
        inversionCount += mergeArr(arr, low, mid, high, temp);
        return inversionCount;

    }

    public static int mergeArr(int[] arr, int low, int mid, int high, int[] temp) {
        int inversionCount = 0;
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
                inversionCount += (mid-left+1);
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
        return inversionCount;
    }
}
