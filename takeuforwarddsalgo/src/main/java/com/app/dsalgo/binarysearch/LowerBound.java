package com.app.dsalgo.binarysearch;

/*
 *  Lower bound mean (only lesser condition) --> find the smallest index where arr[mid] >= x (element should be greater or equal but index should be smallest)
 *  Upper Bound means (only greater condition)--> find the smallest index where arr[mid] > x (element should be greater but index should be smallest)
 * */
public class LowerBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5};
        int x = 4;
        int lb = lowerBound(arr, x);
        System.out.println("Lower bound is: " + lb);
    }

    public static int lowerBound(int[] arr, int x) {
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int ans = n;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] >= x) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
