/**
 * Exercise 5. Find largest and smallest elements of an array.
 */
package com.company;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] ints = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < ints.length ; i++) {
            ints[i]=s.nextInt();
        }
        int smallest=ints[0];
        int largest=ints[0];
        for(int i:ints){
            if(i<smallest){
                smallest=i;
            }
            if(i>largest){
                largest=i;
            }
        }
        System.out.println("Smallest="+smallest);
        System.out.println("Largest="+largest);
    }
}
/** Output:
 Enter 10 numbers:
 11
 21
 45
 12
 65
 41
 28
 94
 65
 34
 Smallest=11
 Largest=94

 Process finished with exit code 0
*/
/**
Enter 10 numbers:
-1
4
5
4
6
2
1
4
8
0
Smallest=-1
Largest=8
4
Process finished with exit code 0
 */