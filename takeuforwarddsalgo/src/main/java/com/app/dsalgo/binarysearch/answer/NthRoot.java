package com.app.dsalgo.binarysearch.answer;

public class NthRoot {

    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }

    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        while(low <= high) {
            int mid = (low+high)/2;
            int midNum = getPower(mid, n, m);
            if(midNum == 1) {
                return mid;
            } else if(midNum == 0) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    // if mid < m return 0;
    // if mid > m return 2
    // if mid == m return 1
    public static int getPower(int mid, int n, int m) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans*mid;
            if(ans > m) {
                return 2;
            }
        }
        if(ans == m) {
            return 1;
        }
        return 0;
    }
}
