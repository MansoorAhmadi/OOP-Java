package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFileInfo {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("test.docx");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
            System.out.println();
        }
        Scanner scanner = new Scanner(myObj);
        List<String> myList = new ArrayList<>();
        String line = "";

        //scanner.nextLine();
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}

OUTPUT:
//getName() will return the file name
//getAbsolutePath() will return the file path/location/directory
//canWrite() will return a boolean
//canRead() will return a boolean as well.
//length() will return the length of the file.

//If the file is not imported into the project, for sure it will return the else statement.
