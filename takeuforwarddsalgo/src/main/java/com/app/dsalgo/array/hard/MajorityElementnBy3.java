package com.app.dsalgo.array.hard;

import java.util.ArrayList;
import java.util.*;

public class MajorityElementnBy3 {

    public static void main(String[] args) {
        int[] arr = {2,2,0,1,2,1};
        List<Integer> resultList = majorityElement(arr);
        resultList.forEach(e -> System.out.print(" " + e));
    }

    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int n = v.length;
        int count1 = 0;
        int count2 = 0;
        int countOfElement1 = 0;
        int countOfElement2 = 0;
        List<Integer> resultList = new ArrayList<>();
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(count1 == 0 && element2 != v[i]) {
                count1 = 1;
                element1 = v[i];
            } else if(count2 == 0 && element1 != v[i]) {
                count2 = 1;
                element2 = v[i];
            } else if(element1 == v[i]) {
                count1++;
            } else if(element2 == v[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < n; i++) {
            if(v[i] == element1) {
                count1++;
            }
            if(v[i] == element2) {
                count2++;
            }
        }
        int mini = (n/3) + 1;
        System.out.println("Arrays size - mini is " + mini);
        if(count1 >= mini) {
            resultList.add(element1);
        }
        if(count2 >= mini) {
            resultList.add(element2);
        }
        Collections.sort(resultList);
        return resultList;
    }
}
