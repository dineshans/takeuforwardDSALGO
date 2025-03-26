package com.app.dsalgo.binarysearch.basic;

public class FindTargetInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,3,7,9,11,12,45};
        int target = 3;
        int search = search(arr, target);
        System.out.println("Index is " + search);

        // using recursion
        int recursiveResult = searchTargetUsingRecursion(arr, target,0,arr.length-1);
        System.out.println("Index using recursive approach:  " + recursiveResult);

    }

    public static int search(int []nums, int target) {
        // Write your code here.
        int low = 0;
        int high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static int searchTargetUsingRecursion(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low+high/2;
        if (arr[mid] == target) {
           return mid;
        } else if (target > arr[mid]) {
           return searchTargetUsingRecursion(arr, target, mid+1, high);
        }
        return searchTargetUsingRecursion(arr, target, low, mid-1);
    }

}
