package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        /*arr[0] = 23;
        arr[1] = 45;
        arr[2] = 65;
        arr[3] = 543;
        arr[4] = 3;

        System.out.println(arr[3]);

        */

        // input using for loop
        System.out.println("Enter 5 numbers: ");
        for (int i =0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("numbers are: ");
        for (int i =0; i<arr.length; i++) {  // alternative way ----> for (int j : arr) {
            System.out.print(arr[i] + " ");  //                       System.out.print(j + " ");
        }

        String[] str = new String[3];
        System.out.println("\n\nEnter 3 strings: ");
        for (int i = 0; i<str.length; i++) {
            str[i] = in.next();
        }
        System.out.println("\nStrings are: "+Arrays.toString(str));
    }
}
