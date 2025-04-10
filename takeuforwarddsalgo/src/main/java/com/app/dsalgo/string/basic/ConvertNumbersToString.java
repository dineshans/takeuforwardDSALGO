package com.app.dsalgo.string.basic;

import java.util.Arrays;

public class ConvertNumbersToString {

    private static String[] singleDigit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static String [] twodigits = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
    private static String [] tenMultiples = new String[] {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
    private static String[] tenspower =new String[] {"hundred", "thousand"};


    public static void main(String[] args) {
        //int num = 12034;
        //String resultStr = convertNumToString(num);
        //System.out.println("Converted numbers to String : " + resultStr);

        /*int num = 123;
        convertNumbersIntoWords(num);*/

        int num = 11;
        convertNumToStringUsingModule(num);
    }
    // it will convert into one two zero, three, four
    public static String convertNumToString(int num) {
        String numbers = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : numbers.toCharArray()) {
            int digit = ch - '0';
            stringBuilder.append(singleDigit[digit]);
        }
        return stringBuilder.toString();
    }

    // using ASCII values
    public static void convertNumbersIntoWords(int number) {
        String numStr = Integer.toString(number);
        int length = numStr.length();
        if(length == 0) {
            return;
        } else if (length == 1) {
            System.out.println(numStr.charAt(0)-'0');
            return;
        }
        for(int i = 0; i < length; i++) {
            if(length > 2) {
                if (numStr.charAt(i) - '0' != 0) {
                    System.out.print(singleDigit[numStr.charAt(i)-'0']+" ");
                    System.out.print(tenspower[length-3]+" ");
                }
                length--;
            }
            else {
                if (numStr.charAt(i) - '0' == 1) {
                    System.out.print(twodigits[numStr.charAt(i+1)-'0']+" ");
                    return;
                } else if (numStr.charAt(i) - '0' != 0) {
                    System.out.print(tenMultiples[numStr.charAt(i)-'0']+" ");
                    if(numStr.charAt(i+1)-'0'!=0)
                        System.out.print(singleDigit[numStr.charAt(i+1)-'0']);
                    return;
                }
            }
        }
    }

    private static String[] singleDigitForModule = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
    private static String [] tenMultiplesForModule = new String[] {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
    private static String[] tensPowerModuler = new String[] {"hundred", "thousand", "Lakhs"};
    // using Module operator
    public static void convertNumToStringUsingModule(int number) {

        number = 2345;
        int a = number % 10;
        int b = number / 10;
        int bModuler = b % 10;
        int c = number / 100;
        int d = number / 1000;
        int g = number / 100; // for 3-digits
        int e = g%10;
        if(number < 10) {
            System.out.println(singleDigit[number]);
        } if (number >= 10 && number < 20) {
            System.out.println(singleDigitForModule[number]);
        } else if (number >= 20 && number < 100) {
            System.out.println(tenMultiplesForModule[b] + " " + singleDigit[a]);
        } else if (number >= 100 && number < 1000) {
            if (a == 0) {
                System.out.println(tensPowerModuler[a]);
            } else {
                System.out.println(singleDigit[c] + " " + tensPowerModuler[0] + " " + tenMultiplesForModule[c] + " " + singleDigit[a]);
            }
        } else if (number >= 1000 && number < 100000) {
            System.out.println(singleDigit[d] + " " + tensPowerModuler[1] + " " + singleDigitForModule[e] + " " + tensPowerModuler[0] + " " + tenMultiplesForModule[bModuler] + " " + singleDigitForModule[a]);
        } /*else if (number >= 100000 && number < 10000000) {
            System.out.println(singleDigit[d] + " " + tensPowerModuler[1] + " " + singleDigitForModule[e] + " " + tensPowerModuler[0] + " " + tenMultiplesForModule[bModuler] + " " + singleDigitForModule[a]);
        }*/
    }

}
