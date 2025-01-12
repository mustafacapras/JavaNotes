package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaInputOutput {
    public static void main(String[] args) throws IOException {

        File myFile = new File ("myFile.txt");
        myFile.createNewFile();

        Scanner fileReader = new Scanner(myFile);

        FileWriter fileWriter = new FileWriter(myFile);

        fileWriter.write("Hello Earth");
        fileWriter.write("\nIt's Mustafa !!");
        fileWriter.flush();
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
        fileWriter.close();

    }
}
