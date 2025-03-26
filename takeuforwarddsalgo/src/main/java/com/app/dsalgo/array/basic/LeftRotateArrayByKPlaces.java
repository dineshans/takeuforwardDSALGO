package com.app.dsalgo.array.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateArrayByKPlaces {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        // using brute force
        //int[] resultArr = leftRotateByKPlaces(arr, k);

        // optimal solution
        /*reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(e -> System.out.print(" " + e));*/

        // rotate using list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> resultList = leftRotateByKPlacesUsingList(list, k);
        resultList.forEach(e -> System.out.print(" " + e));

    }

    /**
     *  First reverse 0-K-1 element
     *  then reverse k-n-1 element
     *  then reverse complete arrays
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /* Complexity = O(N+K)
    *  Space Complexity = O(N)
    * */
    public static int[] leftRotateByKPlaces(int[] arr, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length-k)];
        }
        return arr;
    }

    // using list instead of arrays
    public static List<Integer> leftRotateByKPlacesUsingList(ArrayList<Integer> arrList, int k) {
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            tempList.add(arrList.get(i));
        }

        for (int i = k; i< arrList.size(); i++) {
            arrList.set(i-k, arrList.get(i));
        }

        for (int i = arrList.size()-k; i  < arrList.size(); i++) {
            arrList.set(i, tempList.get(i-(arrList.size()-k)));
        }

        return arrList;
    }

}
