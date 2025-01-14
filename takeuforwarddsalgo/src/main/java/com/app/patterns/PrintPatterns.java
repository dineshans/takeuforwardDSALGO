package com.app.patterns;

public class PrintPatterns {

    public static void main(String[] args) {

        int n = 5;
        //printPatter1(n);
        //printPatter2(n);
        //printPatter3(n);
        //printPatter4(n);
        //printPatter5(n);
        printPatter6(n);
        printPatter7(n);
        printPatter8(n);
        printPatter9(n);
        printPatter10(n);
        printPatter11(n);
        printPatter12(n);
        printPatter13(n);
    }

    /*
     *  print pattern
     *
     *    * * * *
     *    * * * *
     *    * * * *
     *    * * * *
     *    * * * *
     * */

    public static void printPatter1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
    }


    /*
     *  print pattern
     *
     *    *
     *    * *
     *    * * *
     *    * * * *
     *    * * * * *
     * */

    public static void printPatter2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    /*
     *  print pattern
     *
     *    1
     *    1 2
     *    1 2 3
     *    1 2 3 4
     *    1 2 3 4 5
     * */
    public static void printPatter3(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *  print pattern
     *
     *    1
     *    2 2
     *    3 3 3
     *    4 4 4 4
     *    5 5 5 5
     * */

    public static void printPatter4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *  print pattern
     *
     *    * * * * *
     *    * * * *
     *    * * *
     *    * *
     *    *
     * */

    public static void printPatter5(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *  print pattern
     *
     *    1 2 3 4 5
     *    1 2 3 4
     *    1 2 3
     *    1 2
     *    1
     * */

    public static void printPatter6(int n) {

        for (int i = 1; i <=n; i++ ){
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     *  print pattern
     *
     *    1 2 3 4 5
     *    1 2 3 4
     *    1 2 3
     *    1 2
     *    1
     * */

    public static void printPatter7(int n) {


    }

    public static void printPatter8(int n) {


    }

    public static void printPatter9(int n) {


    }

    public static void printPatter10(int n) {


    }

    public static void printPatter11(int n) {


    }

    public static void printPatter12(int n) {


    }

    public static void printPatter13(int n) {

    }
}
