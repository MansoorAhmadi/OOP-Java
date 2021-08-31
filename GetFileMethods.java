package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFileInfo {
    public static void main(String[] args) throws IOException {
        File myObj = new File("test.docx");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            System.out.println();
        } else {
            System.out.println("The file does not exist.");
            System.out.println();
        }

        FileWriter myWriter = new FileWriter("test.docx");
        myWriter.write("I am adding another line to the test.docx file using FileWrite API and .write() method");
        myWriter.close();

        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }
}

OUTPUT:
//exists() will return the existence of the file in the project directory
//getName() will return the file name
//getAbsolutePath() will return the file path/location/directory
//canWrite() will return a boolean
//canRead() will return a boolean as well
//length() will return the length of the file

//I am adding another line to the test.docx file using FileWrite API and .write() method.
