package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) throws IOException {

        try{
            FileWriter myWriter = new FileWriter("test.docx");
            myWriter.write("I am adding another line to the test.docx file using FileWrite API and .write() method");
            myWriter.close();

            System.out.println("The file is modified successfully.");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

//OUTPUT
//The file is modified successfully.
