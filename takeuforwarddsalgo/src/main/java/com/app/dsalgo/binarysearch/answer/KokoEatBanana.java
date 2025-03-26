package com.app.dsalgo.binarysearch.answer;

public class KokoEatBanana {

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int hours = 8;
        int ans = findMinimumBananaEat(v, hours);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

    public static int findMinimumBananaEat(int[] v, int givenHours) {
        int low = 1;
        int high = findMaxFromArray(v);
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low+high)/2;
            int totalHours = calculateHours(v,mid);
            if(totalHours <= givenHours) {
                ans = Math.min(ans, mid);
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static int calculateHours(int[] v, int hourly) {
        int totalHours = 0;
        for(int i = 0; i < v.length; i++) {
            totalHours += (int) Math.ceil((double) v[i] / (double) hourly);
        }
        return totalHours;
    }

    public static int findMaxFromArray(int[] v) {
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i< v.length; i++) {
            maxElement = Math.max(maxElement, v[i]);
        }
        return maxElement;
    }
}
