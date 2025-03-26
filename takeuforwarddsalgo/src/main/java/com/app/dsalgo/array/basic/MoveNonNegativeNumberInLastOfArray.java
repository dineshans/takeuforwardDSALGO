package com.app.dsalgo.array.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNonNegativeNumberInLastOfArray {

    public static void main(String[] args) {

        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        /*int[] resultArr = moveZerosInLast(arr);
        Arrays.stream(resultArr).forEach(element -> System.out.print(" " + element));*/

        int[] resultArr = moveZeros(arr.length, arr);

        Arrays.stream(resultArr).forEach(e -> System.out.print(" " + e));

    }

    public static int[] moveZeros(int n, int []a) {
        int j = -1;
        for(int i = 0; i < n; i ++) {
            if(a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j > -1) {
            for (int i = j + 1; i < n; i++) {
                if (a[i] != 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }

            }
        }
        return a;
    }


    // Brute force Approach
    public static int[] moveZerosInLast(int[] arr) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {  // O(N)
            if (arr[i] != 0) {
                tempList.add(arr[i]);
            }
        }
        for (int i = 0; i < tempList.size(); i++) { // O(X)
            arr[i] = tempList.get(i);
        }
        for (int i = tempList.size(); i < arr.length; i++) { // O(N-X)
            arr[i] = 0;
        }
        return arr;
        /* So complexity = O(N) + O(X) + O(N-X) = O(2N)
              Space = O(N)
         */

    }
}
