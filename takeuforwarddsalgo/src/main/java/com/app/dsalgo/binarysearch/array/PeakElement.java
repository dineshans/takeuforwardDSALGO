package com.app.dsalgo.binarysearch.array;

/*
* Print Any peak element in unsorted array
Peak Element = arr[i-1] <= arr[i] && arr[i] >= arr[i+1] ==> For middle elements
*  Arr[0] && Arr[N-1] can be consider peak element when arr[0] >= arr[i] && arr[N-1] >= arr[N-2]
*  Coz Before Arr[0] & After A[N-1] no element in Array
 */

public class PeakElement {

    public static void main(String[] args) {

        //int[] arr = {10,20,15,2,23,90,67};

        // For inder i = 0 and i = N-1 can be consider Peak Element
        //int[] arr = {20,10,15,2,23,67,90};

        int[] arr = {40,30,20,10};
        int peakElement = findPeakElelementUsingBinarySearch(arr);

        System.out.println("Peak Element is at index " + peakElement);
        // Linear search
        //findPeakElement(arr);
    }
    public static int findPeakElelementUsingBinarySearch(int[] arr) {

        int n = arr.length-1;
        int low = 0;
        int high = n;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(mid == 0){
                if (arr[mid] >= arr[mid+1]) {
                    return arr[mid];
                }
            } else if (mid == n) {
                if (arr[mid] >= arr[mid-1]) {
                    return arr[mid];
                }
            } else {
                if (arr[mid] >= arr[mid-1] && arr[mid]>= arr[mid+1]) {
                    return arr[mid];
                } else if (arr[mid] < arr[mid+1]){
                    low = mid+1; // if mid is less then mid+1 then move to right to get at least one peak Element
                } else {
                    high = mid-1; // if mid > mid+1 then move left to get atleast one peak element
                }
            }
        }
        return -1;

    }

    // Using - linear search
    // O(N)
    public static void findPeakElement(int[] arr) {

        int n = arr.length-1;

        for(int i = 0; i <= arr.length-1; i++) {
            if(i == 0) {
                if (arr[i] >= arr[i+1]) {
                    System.out.println("Find peak Element at index " + i + " = " + arr[i]);
                }

            } else if (i == n) {
                if (arr[i] >= arr[i-1]) {
                    System.out.println("Find peak Element at index " + i + " = " + arr[i]);
                }
            } else {
                if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                    System.out.println("Find peak Element at index " + i + " = " + arr[i]);
                }
            }

        }

    }
}
