package com.app.dsalgo.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequence {

    public static void main(String[] args) {
        printSubsequences("abc");
    }

    public static void printSubsequences(String input) {
        String result = "";
        int n = input.length();
        print(0, n, input, result);

    }
    public static void print(int i, int n, String str, String result) {
        if(i >= n) {
            System.out.println(result);
            return;
        }
        print(i+1, n, str, result+str.charAt(i));
        print(i+1, n, str, result);
    }
}
