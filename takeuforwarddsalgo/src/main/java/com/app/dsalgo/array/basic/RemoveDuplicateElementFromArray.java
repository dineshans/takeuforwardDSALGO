package com.app.dsalgo.array.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        //duplicateUsingSet(arr);
        /*for (int i = 0; i < resultArr.length; i++) {
            System.out.print(" ,"  + Arrays.toString(resultArr));
        }*/
       int sizeOfArr =  duplicateUsingOptimizeApproach(arr);
       System.out.println("Size of result arrays is : " + sizeOfArr);
    }

    /* Brute force approach*/
    public static void duplicateUsingSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        set.forEach(e -> System.out.print("  " + e));

        // or convert set to array and return
        //return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int duplicateUsingOptimizeApproach(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print( " " + arr[k]);
        }
        System.out.println();
        return i+1;
    }
}
