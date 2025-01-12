package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int [n];
        System.out.println("Enter " + n +" elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Original array: "+ Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));


    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end ) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
