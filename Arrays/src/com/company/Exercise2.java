package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 2. Take 10 integer inputs from user and store them in an array. Again, ask user to
 * give a number. Now, tell user whether that number is present in array or not.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] ints = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        System.out.println("Enter number to search :");
        int searchedNumber=s.nextInt();

        Arrays.sort(ints);
        if(Arrays.binarySearch(ints,searchedNumber)>=0){
            System.out.println(searchedNumber +" is present in this array");
        }else{
            System.out.println(searchedNumber+" does not exists in this array");
        }
    }
}
/**
 Enter 10 numbers:
 10
 20
 30
 40
 50
 60
 70
 80
 90
 100
 Enter number to search :
 50
 50 is present in this array

 Process finished with exit code 0
 */

/**
 Enter 10 numbers:
 1
 2
 3
 4
 5
 6
 7
 8
 9
 10
 Enter number to search :
 11
 11 does not exists in this array

 Process finished with exit code 0
 */