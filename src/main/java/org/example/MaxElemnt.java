package org.example;

import java.util.Scanner;

public class MaxElemnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {1, 3, 34, 9, 18};
        System.out.println(max(arr));

    }

    public static int max (int [] arr) {
        int maxVal = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

}
