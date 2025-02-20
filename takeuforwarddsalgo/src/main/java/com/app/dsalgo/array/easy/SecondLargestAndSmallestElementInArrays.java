package com.app.dsalgo.array.easy;

public class SecondLargestAndSmallestElementInArrays {

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,2};
        int secondLargest = secondLargest(arr);
        int secondSmallest = secondSmallest(arr);
        System.out.println("secondLargest Element in Arrays is : " + secondLargest);
        System.out.println("secondSmallest Element in Arrays is : " + secondSmallest);
    }

    private static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < smallest && arr[i] > secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int secondLargest(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        /* This approach is better but its time complexity is 2N because its taking 2 pass to find second largest */
        /*for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }*/

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
