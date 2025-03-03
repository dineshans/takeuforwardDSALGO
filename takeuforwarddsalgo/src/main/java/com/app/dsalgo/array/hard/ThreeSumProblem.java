package com.app.dsalgo.array.hard;

import java.util.*;

/*
*  Find triplets which sum is 0 and triplets should be unique
*
* */
public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 2, 0, 1};
        int n = 5;
       // List<List<Integer>> ans = triplet(n, arr);
        List<List<Integer>> ans = findTripletsOptimalApproach(n,arr);
        for (List<Integer> list : ans) {
            System.out.print("[");
            for (Integer it : list) {
                System.out.print(it + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static List<List<Integer>> findTripletsOptimalApproach(int n, int []arr) {
        Arrays.sort(arr);
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i-1]) {
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> tempList = Arrays.asList(arr[i], arr[j], arr[k]);
                    resultList.add(tempList);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j-1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k+1]) {
                        k--;
                    }
                }

            }

        }
        return resultList;
    }
    /*
    * O(N^2)
    * */
    public static List<List< Integer >> triplet(int n, int []arr) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                       List<Integer> tempList = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(tempList);
                        set.add(tempList);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
