/**
 * Exercise 7: Write a program to shift every element of an array to circularly right. E.g.-
 * INPUT: 1 2 3 4 5
 * OUTPUT: 5 1 2 3 4
 */
package com.company;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int ints[]={1,2,3,4,5,6};
        int last=ints[ints.length-1];
        for(int i=ints.length-1;i>0;i--){
            ints[i]=ints[i-1];
        }
        ints[0]=last;

        System.out.println(Arrays.toString(ints));
    }
}
