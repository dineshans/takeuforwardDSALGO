package com.app.dsalgo.binarysearch.array;

public class PlacingTheCows {

    public static void main(String[] args) {

        int[] arr = {1,2,4,8,9};
        int minimumDistance = placingTheCows(arr, 3);
        System.out.println("minimumDistance to place the cow's is  : " + minimumDistance);
    }

    public static int placingTheCows(int[] arr, int cow) {
       int low =  findMinOfTwoAdjacentElementOfArray(arr);
       int high = arr[arr.length-1] - arr[0];
       int result = 0;

       while(low <= high){

           int mid = (low+high) / 2;
           boolean r = cowArrangementPossible(mid,cow,arr);

           if (!r) {
               high = mid-1;
           } else {
               boolean r1 = cowArrangementPossible(mid+1,cow,arr);
               if (!r1) {
                   result = mid;
                   return result;
               } else {
                   low = mid+1;
               }
           }

       }
        return result;

    }

    // if cow arrangement possible then return true
    public static boolean cowArrangementPossible(int mid, int cow, int[] arr) {

        int n = arr.length;
        int count = 1;
        int preVariable = arr[0];

        if (mid == n-1){
            return false;
        }
        for(int i = 1; i < n; i++){
            if (arr[i]-preVariable < mid) {
                continue;
            } else {
                count++;
                preVariable = arr[i];
            }
        }
        return count >= cow;
    }



    public static int findMinOfTwoAdjacentElementOfArray(int[] arr){

        int diff  = arr[1]-arr[0];
        int min = Integer.MAX_VALUE;
        for(int i = 2; i < arr.length; i++) {
            min =   Math.min(diff, (arr[i]-arr[i-1]));
        }
        return min;
    }
}
