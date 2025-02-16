package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */

//        int [][] arr = new int[3][];
/*
        int [][] arr = {
                {1, 2, 3},     // 0th index
                {4,5},         // 1st index
                {6, 7, 8, 9}   // 2nd index -> arr[2] = {6, 7, 8, 9}
        };

        */

        Scanner in =new Scanner(System.in);

        // input
        int [][] arr = new int[3][3];
        System.out.println(arr.length); // print number of rows

        for (int row = 0; row <arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output
        /*for (int row = 0; row <arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        } */

        for (int [] a: arr) {
            System.out.println(Arrays.toString(a));
        }


    }
}
