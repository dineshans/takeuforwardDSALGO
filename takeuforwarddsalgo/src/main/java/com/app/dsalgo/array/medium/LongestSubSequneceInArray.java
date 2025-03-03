package com.app.dsalgo.array.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubSequneceInArray {

    public static void main(String[] args) {

    }

    public static int longestSuccessiveElements(int []a) {
        // Write your code here.

        int longest = 1;
        int n = a.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        if(n == 0) {
            return 0;
        }
        for(int it : set) {
            if(!set.contains(it-1)) {
                int count = 1;
                int x = it;
                while(set.contains(x+1)) {
                    x = x+1;
                    count = count+1;
                }
                longest = Math.max(longest, count);
            }

        }
        return longest;

    }
}
