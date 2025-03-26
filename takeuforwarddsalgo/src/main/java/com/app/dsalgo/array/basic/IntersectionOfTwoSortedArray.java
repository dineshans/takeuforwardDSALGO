package com.app.dsalgo.array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IntersectionOfTwoSortedArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(2);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        int n1 = arr1.size();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(2);
        arr2.add(3);
        arr2.add(3);
        int n2 = arr2.size();
        List<Integer> resultList = findArrayIntersection(arr1, n1, arr2, n2);
        resultList.forEach(e -> System.out.print(" " + e));
    }

    private static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        while (i < n && j < m) {
            if (Objects.equals(arr1.get(i), arr2.get(j))) {
                resultList.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return resultList;
    }
}
