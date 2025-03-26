package com.app.dsalgo.binarysearch.basic;

public class SearchInsertPositionOfElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 2;
        int result = lowerBound(arr, x);
        System.out.println("Arrays length is " + arr.length);
        System.out.println("find the index is : " + result);
    }

    /*
    *  It's same as Lower bound
    * */
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
