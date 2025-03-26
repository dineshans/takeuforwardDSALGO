package com.app.dsalgo.binarysearch.bunarysearch.answer;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        /*int[] a = {1, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};*/
        int[] a = {1,2,2};
        int[] b = {2,4,4};
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }

    public static double median(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int n = n1 + n2;
        int i = 0;
        int j = 0;
        int count = 0;
        int index2 = n/2;
        int index1 = index2-1;
        int indexEle1 = Integer.MIN_VALUE;
        int indexEle2 = Integer.MIN_VALUE;
        while(i < n1 && j < n2) {
            if(a[i] <= b[j]) {
                if(count == index1) {
                    indexEle1 = a[i];
                }
                if(count == index2) {
                    indexEle2 = a[i];
                }
                count++;
                i++;
            }
            else {
                if(count == index1) {
                    indexEle1 = b[j];
                }
                if(count == index2) {
                    indexEle2 = b[j];
                }
                count++;
                j++;
            }
        }
        while(i < n1) {
            if(count == index1) {
                indexEle1 = a[i];
            }
            if(count == index2) {
                indexEle2 = a[i];
            }
            count++;
            i++;
        }
        while(j < n2) {
            if(count == index1) {
                indexEle1 = b[j];
            }
            if(count == index2) {
                indexEle2 = b[j];
            }
            count++;
            j++;
        }
        if(n%2 == 1) {
            return (double) indexEle2;
        }
        return (double) (indexEle1 +indexEle2)/2.0;
    }
}
