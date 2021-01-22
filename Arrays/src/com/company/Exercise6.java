/**
 * Exercise 6. Write a program to check if elements of an array are same or not read it from
 * front or back.
 */
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int [] ints = new int[size];
        int [] reverseInts =new int[size];
        System.out.println("Enter "+size+" numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ints));
        for(int i=0;i<ints.length;i++){
            reverseInts[i]=ints[ints.length-1-i];
        }
        System.out.println(Arrays.toString(reverseInts));
        if(Arrays.equals(ints,reverseInts)){
            System.out.println("Elements of array are same");
        }else{
            System.out.println("Elements of array are different");
        }
    }
}
/** OUTPUT:
 Enter the size of an array:
 5
 Enter 5 numbers:
 1
 2
 5
 2
 1
 [1, 2, 5, 2, 1]
 [1, 2, 5, 2, 1]
 Elements of array are same

 Process finished with exit code 0
 */
/**
 Enter the size of an array:
 5
 Enter 5 numbers:
 1
 2
 3
 4
 5
 [1, 2, 3, 4, 5]
 [5, 4, 3, 2, 1]
 Elements of array are different

 Process finished with exit code 0
*/