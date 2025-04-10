package com.app.dsalgo.string.basic;


/*
*  Palindrome means after reversing String will be same
* */
public class CheckStringIsPalindrome {

    public static void main(String[] args) {

        //String input="radar";
        String input="ramesh";
        //boolean result = isStringPalindromeUsingReverseString(input);
        boolean result = isStringPalindromeUsingRecursion(input, 0);
        System.out.println("Is String is palindrome: " + result);

    }

    // using reverse approach
    public static boolean isStringPalindromeUsingReverseString(String str) {
        int length = str.length()-1;
        String outPut = "";
        for(int i = length; i >= 0; i--) {
            outPut = outPut+str.charAt(i);
        }
        if (str.equalsIgnoreCase(outPut)) {
            return true;
        }
        return false;
    }

    // using recursion
    public  static boolean isStringPalindromeUsingRecursion(String str, int i) {
        int n = str.length()-1;
        if(i >= n/2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n-i)) {
            return false;
        }
        return isStringPalindromeUsingRecursion(str, i+1);
    }

}
