/**
 * Exercise 3: Take 20 integer inputs from user and print the following:
 * number of positive numbers
 * number of negative numbers
 * number of odd numbers
 * number of even numbers
 * number of 0s.
 */
package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] ints = new int[20];
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }

        int positiveCount=0;
        int negativeCount=0;
        int oddCount=0;
        int evenCount=0;
        int zeroCount=0;

        for (int i: ints) {
            if(i>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }

            if(i%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            if(i==0){
                zeroCount++;
            }

        }
        System.out.println("Number of Positive numbers :" + positiveCount);
        System.out.println("Number of Negative numbers :" + negativeCount);
        System.out.println("Number of Odd numbers :" + oddCount);
        System.out.println("Number of Even numbers :" + evenCount);
        System.out.println("Number of zeros :" + zeroCount);
    }
}
/**
 * Output:
 Enter 20 numbers:
 10
 20
 54
 12
 48
 74
 55
 62
 -8
 0
 12
 44
 77
 65
 45
 62
 -85
 -11
 18
 -5
 Number of Positive numbers :16
 Number of Negative numbers :4
 Number of Odd numbers :7
 Number of Even numbers :13
 Number of zeros :1
 */