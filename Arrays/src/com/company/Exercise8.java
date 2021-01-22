package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sorting refers to arranging data in a particular format. Sort an array of integers in ascending order.
 * One of the algorithms is selection sort. Use below explanation of selection sort to do this.
 * INITIAL ARRAY:
 * 2 3 1 45 15
 * First iteration: Compare every element after first element with first element and if it is larger than
 * swap. In first iteration, 2 is larger than 1. So, swap it.
 * 1 3 2 45 15
 * Second iteration: Compare every element after second element with second element and if it is
 * larger than swap. In second iteration, 3 is larger than 2. So, swap it.
 * 1 2 3 45 15
 * Third iteration: Nothing will swap as 3 is smaller than every element after it.
 * 1 2 3 45 15
 * Fourth iteration: Compare every element after fourth element with fourth element and if it is
 * larger than swap. In fourth iteration, 45 is larger than 15. So, swap it.
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int [] ints = new int[size];
        System.out.println("Enter "+size+" numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        int temp;
        for(int i=0;i<ints.length;i++){
            for(int j=i+1;j<ints.length;j++){
                if(ints[i]>ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
/**
 Output:
 Enter the size of an array:
 5
 Enter 5 numbers:
 2
 3
 1
 45
 15
 [1, 2, 3, 15, 45]

 Process finished with exit code 0
 */