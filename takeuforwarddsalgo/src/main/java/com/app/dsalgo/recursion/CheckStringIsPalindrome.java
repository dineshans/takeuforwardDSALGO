package com.app.dsalgo.recursion;


// string after reverse will be same
public class CheckStringIsPalindrome {

    public static void main(String[] args) {
        //String str = "MADAM";
        String str = "MADAMN";
        System.out.println(isPalindrome(str, 0));
    }


    // 1) using single pointer also can do
    // 2) we can take 2 pointer also i and j to check
    public static boolean isPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n/2) { // once reached to middle element will return true;
            return true;
        }
        if(str.charAt(i) != str.charAt(n-i-1)) {
            return false;
        }
        return isPalindrome(str,i+1);
    }
}
