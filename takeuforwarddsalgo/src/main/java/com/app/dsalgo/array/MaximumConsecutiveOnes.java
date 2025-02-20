package com.app.dsalgo.array;

import static java.lang.Math.max;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1};
        int maxCount = maxConsecutiveNumber(arr);
        System.out.println("Max count of consecutive once's is : " + maxCount);
    }

    private static int maxConsecutiveNumber(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxCount = max(maxCount, count);
                /*if (count > maxCount) {
                    maxCount = count;
                }*/
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
