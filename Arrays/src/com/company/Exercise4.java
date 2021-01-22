package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4. Take 10 integer inputs from user and store them in an array. Now, copy all the
 * elements in another array but in reverse order
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] ints = new int[10];
        int [] reverseInts =new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ints));
        for(int i=0;i<ints.length;i++){
            reverseInts[i]=ints[ints.length-1-i];
        }
        System.out.println(Arrays.toString(reverseInts));

    }
}
/**
 Enter 10 numbers:
 11
 54
 21
 65
 12
 45
 12
 48
 47
 45
 [11, 54, 21, 65, 12, 45, 12, 48, 47, 45]
 [45, 47, 48, 12, 45, 12, 65, 21, 54, 11]

 Process finished with exit code 0
 */