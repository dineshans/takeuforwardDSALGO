package com.app.dsalgo.binarysearch.array;

/*
* If the target key is present return index, if not then return insertion position of the element
*
* */
public class IndexOfInsertion {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 4;
        int insertionPosition = findIndexPosition(arr, target);
        System.out.println("InsertionPosition index is : " + insertionPosition);
    }

    private static int findIndexPosition(int[] arr, int target) {

        int low = 0;
        int high = arr.length-1;
        int resultIndex = -1;

        while(low <= high) {

            int mid = low+high/2;

            if(arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid+1;
            } else if(arr[mid] > target) {
                high = mid-1;
            }
            if (low > high) {
                resultIndex = low;
            }
        }
        return resultIndex;
    }
}
