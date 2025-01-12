package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[] a = new int[5];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(a));

        int [] arr = {1, 3, 34, 9, 18};
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
