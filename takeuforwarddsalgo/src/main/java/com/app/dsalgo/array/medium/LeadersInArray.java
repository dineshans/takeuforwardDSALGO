package com.app.dsalgo.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
       /* int[] arr = {1, 2, 3, 2};
        List<Integer> result = findLeadersInArray(arr);
        result.forEach(e -> System.out.print(" " + e));*/

        System.out.println();

        int[] arr1 = {187,64,133,62,49,163,50,115,42,65,60,49,32,87,141,142,146,159};
        List<Integer> result1 = findLeadersInArray(arr1);
        result1.forEach(e -> System.out.print(" " + e));

       //146 159 163 187
        // 159 163 187



    }

    public static List<Integer> findLeadersInArray(int[] a) {
        int n = a.length;
        int max = a[n-1];
        List<Integer> resultList = new ArrayList<>();
        resultList.add(max);
        for (int i = n-2; i >= 0; i--) {
            if (a[i] > max) {
                resultList.add(a[i]);
            }
            max = Math.max(max, a[i]);
        }
        Collections.sort(resultList);
        return resultList;
    }
}
