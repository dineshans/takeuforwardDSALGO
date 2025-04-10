package com.app.dsalgo.slidingwindow.twopointers.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringUsingMap {

    public static void main(String[] args) {

        String s = "abcabcbb";
        int result = longestLength(s);
        System.out.println("Longest String length is : " + result);
    }

    public static int longestLength(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        int n = str.length();

        while(r < n) {
            if(map.containsKey(str.charAt(r))) {
                l  = Math.max(map.get(str.charAt(r))+1, l );
            }
            maxLength = Math.max(maxLength, r-l+1);
            map.put(str.charAt(r), r);
            r++;
        }
        return maxLength;
    }
}
