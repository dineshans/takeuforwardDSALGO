package com.app.dsalgo.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraysForGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        //int longestLength = longestSubArray(arr, 3);
        //int longestLength = longestSubArrayUsingHashMap(arr, 3);

        /*int[] arr = {2, 3, 5, 1, 9};
        int k = 10;*/
        int longestLength = longestSubArrayOptimalApproach(arr, k);
        System.out.println("Longest Sub arrays length is : " + longestLength);
    }

    public static int longestSubArrayOptimalApproach(int[] arr, int k) {

        int sum = arr[0];
        int maxLength = 0;
        int n = arr.length;
        int left = 0;
        int right = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right-left+1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLength;
    }

    /* Using hashMap*/
    public static int longestSubArrayUsingHashMap(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> preMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;
            if (preMap.containsKey(rem)) {
                int len = i - preMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preMap.containsKey(sum)) {
                preMap.put(sum, i);
            }
        }
        return maxLen;
    }

    /*
    *  Brute force O(n^3)
    * */
    public static int longestSubArray(int[] arr, int givenSum) {
        int longestLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                    if (sum == givenSum) {
                        longestLength = Math.max(longestLength, j-i+1);
                    }
                }
        }
        return longestLength;
    }
}
