package org.example;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Mustafa Capras";

        // Q: store 5 roll numbers
         int rno1 = 21;
         int rno2 = 22;
         int rno3 = 23;// ...etc

        // Array is collection of datatype
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int [5];
        // or directly
        int[] rnos2 = {5,6,84,95,21}; // all the type of the data in the array should be same

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int [5]; // initialization: actually here object is being created in the memory (heap)
        //int[] ros = new int[5];   Declaring and initializing an array of 5 integers

        ros[1] = 10;
        ros[2] = 20;
        ros[3] = 30;
        String[] names = new String [3];
        names[0] = "Mustafa Capras";
        names[1] = "Al Pacino";
        names[2] = "Mice";

        for (String s : names) {
            System.out.println(s);
        }


        //System.out.println("The nicknames are: "+Arrays.toString(names));





    }
}