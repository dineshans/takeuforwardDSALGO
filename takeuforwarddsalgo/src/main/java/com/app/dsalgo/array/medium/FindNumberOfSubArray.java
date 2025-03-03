package com.app.dsalgo.array.medium;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfSubArray {

    public static void main(String[] args) {
        int[] arr = {4,6};
        int k = 2;
        int result = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("Total number of SubArray is : " + result);
    }
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length;
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        for(int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum == k) {
                count++;
            }
            int key = currentSum-k;
            if (prefixSum.containsKey(key)) {
                count += prefixSum.get(key);
            }
            prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
