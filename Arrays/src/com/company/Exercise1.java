package com.company;

import java.util.Scanner;


public class Exercise1 {
    /**
     * Exercise 1. Take 10 integer inputs from user and store them in an array and print them on
     * screen.
     * Output:
     *      Enter 10 numbers:
     *      11
     *      22
     *      33
     *      44
     *      55
     *      66
     *      77
     *      88
     *      99
     *      1111
     *      11
     *      22
     *      33
     *      44
     *      55
     *      66
     *      77
     *      88
     *      99
     *      1111
     *
     *      Process finished with exit code 0
     *      */

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] ints = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        System.out.println("You have entered following elements:");
        for (int j:ints) {
            System.out.println(j);
        }
    }
}
