package com.app.dsalgo.array.hard;

import java.util.*;

public class Sum4 {

    public static void main(String[] args) {
        int[] arr = {2 , 2, 2, 1, 3};
        int n = 5;
        int target = 8;
        List<List<Integer>> result = findTheCords4SumBruteForce(arr, n, target);
        for (List<Integer> ans : result) {
            System.out.print("[ ");
            for (Integer ele : ans) {
                System.out.print(ele + " ");
            }
            System.out.print("]");
        }
    }

    public static List<List<Integer>> findTheCords4SumBruteForce(int[] arr, int n, int target){
        List<List<Integer>> resultList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for(int l = k+1; l < n; l++) {
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> tempList = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(tempList);
                            set.add(tempList);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
