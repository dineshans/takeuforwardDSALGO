package com.app.dsalgo.cpp;

public class FindNextGreaterPalindrome {

    public static void main(String[] args) {
        int[] testCases = {125, 250, 123, 397, 4512, 1234, 1997};
        //int[] testCases = {397, 4512, 1234, 1997};
        for (int num : testCases) {
            System.out.println("Next palindrome of " + num + " is: " + nextPalindromeMiddleOut(num));
        }
    }

    public static int nextPalindromeMiddleOut(int num) {

        String str = String.valueOf(num);
        int n = str.length();
        char[] chars = str.toCharArray();
        if(n == 1 && chars[0] < 10) {
            return Integer.parseInt(new String(chars)) + 1;
        }
        int left = (n-1)/2;
        int right = n/2;

        // swap mirror half
        while (left >= 0) {
            chars[right] = chars[left];
            left--;
            right++;
        }

        int candidateResult = Integer.parseInt(new String(chars));
        if(candidateResult > num) {
            return candidateResult;
        }

        // now increament second half

        left = (n-1)/2;
        right = n/2;

        while (left >= 0 && chars[left] == '9') {
            chars[left] = chars[right] = '0';
            left--;
            right++;
        }

        if (left >= 0) {
            if(n % 2 == 1) {
                chars[left]++;
                if (chars[n/2] == '0') {
                    chars[right]++;
                }
            } else {
                chars[left]++;
                chars[right]++;
            }
        } else {
            return num + 2;
        }
        return Integer.parseInt(new String(chars));
    }
}
