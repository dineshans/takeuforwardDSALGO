package com.app.dsalgo.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* Find the number that appears once, and the other numbers twice */
public class FindTheSingleElement {

    public static void main(String[] args) {
        int[] arr =  {1, 1, 2, 3, 3, 4, 4};
        //Long result = findSingleElement(arr);
        //int result = findSingleElementOptimalApproach(arr);
        int result = findSingleElementOptimalApproach1(arr);
        System.out.println("No occurs once is : " + result);
    }

    /*
    *  Using XOR operators
    * */
    public static int findSingleElementOptimalApproach(int[] arr) {
        int XOR = 0;
        for(int i = 0; i < arr.length; i++) {
            XOR ^= arr[i];
        }
        return XOR;
    }

    public static int findSingleElementOptimalApproach1(int[] arr) {
        for (int i = 0; i < arr.length-1; i+=2){
            if (arr[i] != arr[i+1]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }

    /* find the element occurs only once
    *  using HashMap
    * Taking Long as key coz if we got very long input like 10^7
    * */
    private static Long findSingleElement(int[] arr) {

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put((long) arr[i], 1);
            } else {
                map.put((long) arr[i], map.get(arr[i]) + 1);
            }
        }
        Optional<Long> optional = map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        long result = 0;
        if (optional.isPresent()) {
            result = optional.get();
        }
        return result;
    }
}
