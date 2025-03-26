package com.app.dsalgo.binarysearch.array;

/*
* Find First and Last Occurence of the target key
*
* */

public class FirstAndLastOccurence {

    public static void main(String[] args) {

        int[] arr = {1, 3 , 3, 4, 5};
        
        int key = 3;
        int firstOccurence = findFirstOccurence(arr, key);
        int lastOccurence = findLastOccurence(arr, key);

        System.out.println("firstOccurence is : " + firstOccurence);
        System.out.println("lastOccurence is : " + lastOccurence);
    }
    public static int findFirstOccurence(int[] arr, int key) {

        int low = 0;
        int high = arr.length-1;

        while(low <= high) {

            int mid = low + high / 2;

            if(arr[mid] < key){

                low = mid+1;

            } else if(arr[mid] > key ){
                high = mid-1;
            } else {
                if(mid == 0){
                    return mid;
                } else if (arr[mid] == key && arr[mid-1] != key) {
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static int findLastOccurence(int[] arr, int key) {

        int low = 0;
        int high = arr.length;

        while(low <= high){

            int mid = low+high/2;

            if(arr[mid] < key) {
                low = mid+1;
            } else if (arr[mid] > key) {
                high = mid-1;
            } else {
                if (arr[mid] == arr.length-1) {
                    return mid;
                } else if (arr[mid] == key && arr[mid+1] != key) {
                    return mid;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
