package com.app.dsalgo.binarysearch.array;

/*
* Given a Sorted Array, Find the element which comes twice
*  N >= 2 (Size of array should be atleast 2 element)
* Contrains -
*         1) All elements comes once only one element will come twice
*         2) If N = 8, then Elements will be from 1.....7
* */
public class RepeatedElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,6,7};

        //int[] arr = {1,1,2,3,4,5,6,7};

        //int element = findRepeatedElement(arr);

        int element = findRepeatedElementUsingBinarySearch(arr);

        System.out.println("Element is ==> " + element);

    }

    // Using Binary Search
    public static int findRepeatedElementUsingBinarySearch(int[] arr) {

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = low+high/2;
            if (arr[mid] == mid) {
                high = mid-1;
            } else {
                if (arr[mid+1] == arr[mid]) {
                    return arr[mid];
                } else {
                    low = mid+1;
                }
            }

            }
        return -1;
    }

    // Using linear Search
    public static int findRepeatedElement(int[] arr) {

        int n = arr.length;
        int result = -1;
        if (n >= 2) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[i + 1]) {
                    result = arr[i];
                }
            }
        }
        return result;
    }
}
