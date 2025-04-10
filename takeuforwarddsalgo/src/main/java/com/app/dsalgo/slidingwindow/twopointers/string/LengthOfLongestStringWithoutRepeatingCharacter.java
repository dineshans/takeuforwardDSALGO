package com.app.dsalgo.slidingwindow.twopointers.string;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestStringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfUniqueString(s);
        System.out.println("Longest String length is : " + result);
    }

    public static int lengthOfUniqueString(String str) {
        int n = str.length();
        Set<Character> set = new HashSet<>();
        int maxLength = Integer.MIN_VALUE;
        if (n == 0) return 0;
        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (set.contains(str.charAt(j))) {
                    maxLength = Math.max(maxLength, j-i);
                    break;
                }
                set.add(str.charAt(j));
            }

        }
        return maxLength;
    }
}
