package com.company;

import java.util.Scanner;

/**
 * 9. Input any number. Find the sum of the digits of the number using a recursive function.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input any number:");
        int num=s.nextInt();
        System.out.println("Sum of digits ="+sum(num));
    }

    public static int sum(int n){
        if(n==0) return 0;
        return (n%10)+sum(n/10);
    }
}
/**
 Input any number:
 5789
 Sum of digits =29

 Process finished with exit code 0
 */