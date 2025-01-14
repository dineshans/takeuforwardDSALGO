package com.app.dsalgo.maths;

public class ExtractTheDigits {

    public static void main(String[] args) {

        extractDigitsFromNumber(7789);
        countDigit(7789);
    }

    /* given number N = 7789, then digits will be 9, 8, 7,7 */
    public static void extractDigitsFromNumber(int num) {

        while (num > 0) {

            int lastDigit = num % 10;
            System.out.print(lastDigit + " , ");
            num = num/10;
        }
        System.out.println();
    }

    /* if num = 123, that means total digit is 3 */
    public static void countDigit(int num) {

        int count = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            count++;
            num = num / 10;
        }

        System.out.println("Total digit is in number : " + num);

    }
}
