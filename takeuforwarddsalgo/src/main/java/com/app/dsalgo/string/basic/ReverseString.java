package com.app.dsalgo.string.basic;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Software";
        String resultStr = reverseString(input);
        System.out.println("String reverse: " + resultStr);
    }

    public static String reverseString(String str) {
        int strLength = str.length()-1;
        String outputStr = "";
        for(int i = strLength; i >= 0; i--) {
            //char reverse = str.charAt(i);
            outputStr = outputStr + str.charAt(i);
        }
        return outputStr;
    }
}
