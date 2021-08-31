package com.company;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {

        File myFile = new File("test.docx");
        if (myFile.exists()){
            System.out.println("The file exists");
            System.out.println("The file name is: " + myFile.getName());
            System.out.println("The file location is: " + myFile.getAbsolutePath());
            System.out.println("The file is readable: " + myFile.canRead());
            System.out.println("The file is writeable: " + myFile.canWrite());
            System.out.println("The file is length is: " + myFile.length());
        }else {
            System.out.println("Sorry, but the file does not exist!");
        }

        File myObj = new File("filename.txt");
        if (myObj.createNewFile()) {
            System.out.println("New file created: " + myObj.getName());
        } else if (myObj.exists()){
            System.out.println("File already exists.");
            System.out.println("Deleting...");
            System.out.println(myObj + " " + "deleted");
            myObj.delete();
        }
        else {
            System.out.println("File already exists.");
        }
    }
}

//OUTPUT: First execution
//The file exists
//The file name is: test.docx
//The file location is: /Users/mansoorahmadi/Documents/MOb3/test.docx
//The file is readable: true
//The file is writeable: true
//The file is length is: 86
//File already exists.
//Deleting...
//filename.txt deleted

//Next execution will be:
//The file exists
//The file name is: test.docx
//The file location is: /Users/mansoorahmadi/Documents/MOb3/test.docx
//The file is readable: true
//The file is writeable: true
//The file is length is: 86
//New file created: filename.txt
