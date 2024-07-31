package com.app.array;

public class FindLargestElementInArray {

    public static void main(String[] args) {

        int[] arr = {5,3,10,15,8,3,4};

        int maxElement = findLargestElement(arr);

        System.out.println("Largest Element in Array is : " + maxElement);

    }

    public static int findLargestElement(int[] arr) {

        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }

        }
        return maxElement;
    }
}
