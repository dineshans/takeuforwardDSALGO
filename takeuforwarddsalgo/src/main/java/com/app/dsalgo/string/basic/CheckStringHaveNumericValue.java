package com.app.dsalgo.string.basic;

public class CheckStringHaveNumericValue {

    public static void main(String[] args) {

        String name = "manish1";
        boolean result = isNumericValue(name);
        System.out.println("String contains numeric: " + result);
    }

    public static boolean isNumericValue(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean digit = Character.isDigit(str.charAt(i));
            if (digit) {
                return true;
            }
        }
        return false;
    }
}
