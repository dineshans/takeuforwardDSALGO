package com.app.dsalgo.array.medium;

import java.util.HashMap;
import java.util.Map;

/* FInd the element which is element > n/2 times appears */
public class MajorityElementN2 {

    public static void main(String[] args) {

        int[] arr = {2,2,3,3,1,2,2};
        int n = arr.length;
        //int result = majorityElementReturnUsingBruteForceApproach(arr, n);
        //int result = majorityElementReturnUsingHashing(arr, n);
        int result = majorityElementReturnUsingOptimalApproach(arr, n);
        System.out.println("MajorityElement is : " + result);
    }

    /*
     *  Moore's Voting Algorithm
     * Steps -->
     * 1) Apply Moore's voting algorithm
     * 2) Verify element which you got is majority element
     * 3) from above steps we got the element, iterate through the array and get the count of the element and check with > N/2
     *
     * Complexity O (N)
     * Space Complexity O (1)
     * */
    public static int majorityElementReturnUsingOptimalApproach(int[] arr, int n) {
        int count = 0;
        int ele = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                count1++;
            }
            if (count1 > n/2) {
                return arr[i];
            }
        }

        return -1;
    }



    /*
    * Complexity O (N)
    * Space Complexity O (N)
    * */
    public static int majorityElementReturnUsingHashing(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int freq = 1;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], freq);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map.entrySet().stream().filter(ele -> ele.getValue() > n/2).map(Map.Entry::getKey).findFirst().orElse(-1);
    }



    /* complexity = O(N^2)
    *  space complexity = O(1)
    * */
    public static int majorityElementReturnUsingBruteForceApproach(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
                if (count > n/2) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
