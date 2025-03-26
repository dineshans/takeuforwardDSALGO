package com.app.dsalgo.binarysearch.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastOccurenceOfNumber {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(5);
        int k = 1;
        int[] result = firstAndLastPosition(arr, arr.size(), k);
        Arrays.stream(result).forEach(e -> System.out.print(" " + e));
        System.out.println();
        System.out.println("   ================= ");

        // using plain binary search
        //int[] arr1 = {2,4,6,8,8,8,11,13};
        //int k1 = 8;
        int[] arr1 = {0,1,1,5};
        int k1 = 1;
        int[] resultUsingPlainBinarySearch = findFirstAndLastUsingPlainBinarySearch(arr1, arr1.length, k1);
        Arrays.stream(resultUsingPlainBinarySearch).forEach(e -> System.out.print(" " + e));

    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.\
        int lb = lowerBound(arr,n,k, 0, n-1);
        int ub = upperBound(arr,n,k, 0, n-1);
        if(lb == n || arr.get(lb) != k) {
            return new int[] {-1,-1};
        }
        else {
            return new int[]  {lb,ub-1};
        }
    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int k, int low, int high) {
        int ans = n;
        while(low <= high) {
            int mid = (low+high) /2;
            if(arr.get(mid) >= k) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(ArrayList<Integer> arr, int n, int k, int low, int high) {
        int ans = n;
        while(low <= high) {
            int mid = (low+high) /2;
            if(arr.get(mid) > k) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }


    /*
    *  Using plain binary search
    * */

    public static int[] findFirstAndLastUsingPlainBinarySearch(int[] arr, int n, int k) {
        int firstOccurrence = findFirstOccurrence(arr, n, k);
        int lastOccurrence = findLastOccurrence(arr, n, k);
        if (lastOccurrence == -1 && firstOccurrence != -1) {
            lastOccurrence = firstOccurrence;
        }
        if (firstOccurrence == -1 && lastOccurrence != -1) {
            firstOccurrence = lastOccurrence;
        }
        return new int[] {firstOccurrence, lastOccurrence};
    }

    /*
    * Since Arrays is sorted so first occurrence always will be in left search space
    * */
    public static int findFirstOccurrence(int[] arr, int n, int k) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] ==  k) {
                ans = mid;
                high = mid-1;
            } else if (arr[mid] < k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;

    }

    /*
     * Since Arrays is sorted so last occurrence always will be in left search space
     * */
    public static int findLastOccurrence(int[] arr, int n, int k) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] ==  k) {
                ans = mid;
                low = mid+1;
            } else if (arr[mid] < k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }

}
