package com.app.dsalgo.maths;

public class ReverseNumber {

    public static void main(String[] args) {

        reverseNumber(7789);

    }

    public static void reverseNumber(int num) {

        int reverseNum = 0;
        while (num > 0) {

            int lastDigit = num % 10;
            reverseNum = (reverseNum*10) + lastDigit;
            num = num / 10;
        }

        System.out.println("Reverse Number is : " + reverseNum);

    }
}
