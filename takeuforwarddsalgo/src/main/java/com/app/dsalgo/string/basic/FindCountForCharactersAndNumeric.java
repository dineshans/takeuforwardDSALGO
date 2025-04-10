package com.app.dsalgo.string.basic;

public class FindCountForCharactersAndNumeric {

    public static void main(String[] args) {
        String name= "Rahul1234";
        findCount(name);
    }

    public static void findCount(String str) {

        int chCount = 0;
        int numericCount = 0;
        int alphabetCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                numericCount++;
            } /*else if (Character.isAlphabetic(str.charAt(i))) {
                alphabetCount++;
            }*/ else {
                chCount++;
            }
        }
        System.out.println("Numeric count is : " + numericCount);
        //System.out.println("alphabet count is : " + alphabetCount);
        System.out.println("Character count is  : " + chCount);
    }
}
