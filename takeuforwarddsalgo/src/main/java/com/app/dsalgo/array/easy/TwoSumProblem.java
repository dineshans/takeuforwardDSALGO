package com.app.dsalgo.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        int[] resultArr = twoSum(arr, target);
        String result = twoSumToReturnString(arr, target);
        Arrays.stream(resultArr).forEach(System.out::println);
        System.out.println("Arrays have pairs : " + result);
    }

    /* using two pointer but need to sort the array
    *  this approach is good when you need to return String
    * */
    public static String twoSumToReturnString(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";

    }

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Map<Integer, Integer> map  = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int needed = target-arr[i];
            if(map.containsKey(needed)) {
                ans[0] = map.get(needed);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;

    }
}
