package com.app.dsalgo.binarysearch.array;

/*
* Find the key into Sorted Array
*
*/
public class FindTheKeyIntoGivenSortedArray {

    public static void main(String[] args) {

        int[] arr = {10,23,40,45,56,70,93,100,121};
        int result = searchKey(arr, 40);

        System.out.println("Found the key index is  :  "  + result);
    }
    public static int searchKey(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;

        while(low <= high) {

            int mid = (low+high) / 2;

            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key){

                low = mid+1;
            } else {

                high = mid -1;
            }
        }

        return -1;
    }
}
