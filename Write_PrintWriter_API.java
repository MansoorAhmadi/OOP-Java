package FilesExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WriteFiles {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Files.writeString(new File("testme.txt").toPath(),"testing some strings", StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(new File("testme.txt"));
        pw.write("I am using PrintWriter API to write\n");
        pw.write("I am writing another line as well.");

        pw.flush();
        //PrintWriter API is using buffer. It will not display until we flush it.

        PrintWriter pw1 = new PrintWriter(System.out);
        pw1.write("I am using system out inside PrintWriter");
        pw1.flush();
    }
}

//OUTPUT OF CONSOLE
//I am using system out inside PrintWriter

//TESTME.TXT
//I am using PrintWriter API to Write
//I am writing another line as well.
