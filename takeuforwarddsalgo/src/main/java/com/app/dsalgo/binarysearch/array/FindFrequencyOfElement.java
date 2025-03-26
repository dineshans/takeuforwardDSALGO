package com.app.dsalgo.binarysearch.array;


/*
* find first Occurence & Last Occurence and find the difference => lastOccurence-firstOccurence+1
* */
public class FindFrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};
        int key =2; // o/p = first index = 2, last index = 4 and 2 = 3 times

        int firstOccurence = FirstAndLastOccurence.findFirstOccurence(arr,key);
        int lastOccurence = FirstAndLastOccurence.findLastOccurence(arr,key);

        int Frequency = lastOccurence-firstOccurence+1;

        System.out.println("firstOccurence : " + firstOccurence);
        System.out.println("lastOccurence : " + lastOccurence);
        System.out.println("Frequency   : " + Frequency);
    }
}
