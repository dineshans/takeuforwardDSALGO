package com.app.dsalgo.binarysearch.basic;

/*
*  Lower bound mean (only lesser condition) --> find the smallest index where arr[mid] >= x (element should be greater or equal but index should be smallest)
* Upper Bound means (only greater condition)--> find the smallest index where arr[mid] > x (element should be greater but index should be smallest)
* */
public class UpperBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int result = getUpperBound(arr, x);
        System.out.println("Arrays length is " + arr.length);
        System.out.println("find the index is : " + result);
    }

    public static int getUpperBound(int[] arr, int x) {
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int ans = n;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] > x) {
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
