package com.app.dsalgo.array.medium;

public class LongestSubArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        long totalSum = longestSubArraySum(arr, arr.length);
        System.out.println("Longest Sub Arrays sum is : " + totalSum);
        longestSumForSubArrays(arr, arr.length);

        System.out.println("Array size : " + arr.length/2);
    }

    /*
    *  Kadane's Algorithm
    * Return sum of longest sub array
    * */
    public static long longestSubArraySum(int[] arr, int n) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    /*
    * kadane's algorithm
    * Instead of sum return sub array index
    * */
    public static void longestSumForSubArrays(int[] arr, int n) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        int sIndex = 0;
        int ansStartIndex = -1;
        int ansEndIndex = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                sIndex = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansStartIndex = sIndex;
                ansEndIndex = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = ansStartIndex; i <= ansEndIndex; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
