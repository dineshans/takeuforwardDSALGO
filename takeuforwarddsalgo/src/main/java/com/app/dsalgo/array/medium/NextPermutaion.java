package com.app.dsalgo.array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutaion {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 2);
        List<Integer> result = nextGreaterPermutation(list);
        result.forEach(e -> System.out.print( " " + e));

    }

    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.

        int n = A.size();
        int index = -1;
        for(int i = n-2; i >= 0; i--) {
            if(A.get(i) < A.get(i+1)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            Collections.reverse(A);
            return A;
        }
        for(int i = n-1; i > index; i--) {
            if(A.get(i) > A.get(index)) {
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
                break;
            }
        }
        List<Integer> subList = A.subList(index+1, n);
        Collections.reverse(subList);
        return A;

    }
}
