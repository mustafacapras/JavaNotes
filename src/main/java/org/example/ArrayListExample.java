package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(0); // with this method we are adding elements to the array
//        list.add(1);
//        list.add(67);
//        list.add(12235);
//        list.add(654);
//
//        System.out.println(list.contains(67));
//
//        list.set(0,9);
//
//        list.remove(2); // it will remove element number 2 which is: 67
//
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] will not work here
        }
        System.out.println(list);


    }
}
