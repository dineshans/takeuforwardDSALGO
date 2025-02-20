package com.app.dsalgo.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArray {

    public static void main(String[] args) {

        /*int[] a = {1,1,2,3,4,5};
        int[] b = {2,3,4,4,5};*/
        int[] a = {1,2,3,3};
        int[] b = {2,2,4};
        /*List<Integer> resultList = unionOfSortedArray(a,b);
        resultList.forEach(e -> System.out.print(" " + e));*/
        List<Integer> resultList = unionOfSortedArrayOptimal(a,b);
        resultList.forEach(e -> System.out.print(" " + e));

    }

    public static List< Integer > unionOfSortedArrayOptimal(int []a, int []b) {
        int i = 0;
        int j = 0;
        int n1 = a.length;
        int n2 = b.length;
        Integer lastAdded = null;
        List<Integer> resultList = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                if (lastAdded == null || lastAdded != a[i]) {
                    resultList.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (lastAdded == null || lastAdded != a[i]) {
                    resultList.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
            } else {
                    if (lastAdded == null || lastAdded != b[j]) {
                        resultList.add(b[j]);
                        lastAdded = b[j];
                    }
                    j++;
            }

        }
        while (i < n1) {
            if (lastAdded == null || lastAdded != a[i]) {
                resultList.add(a[i]);
                lastAdded = a[i];
            }
            i++;
        }
        while (j < n2) {
            if (lastAdded == null || lastAdded != b[j]) {
                resultList.add(b[j]);
                lastAdded = b[j];
            }
            j++;
        }

            return resultList;

    }

    /* Using Set data structure */
    public static List<Integer> unionOfSortedArray(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i =0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i =0; i < b.length; i++) {
            set.add(b[i]);
        }
        return new ArrayList<>(set);
    }
}
