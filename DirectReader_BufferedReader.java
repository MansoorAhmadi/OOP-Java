package FilesExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesExample {

    public static void main(String[] args) throws IOException {

//        List<String> line = Files.readAllLines(new File("MOb3.iml").toPath());
//        System.out.println(line);

        Scanner scanner = new Scanner(new File("MOb3.iml").toPath());
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

        FileReader fr = new FileReader("MOb3.iml");
        BufferedReader br = new BufferedReader(fr);
        String i;
        while ((i = br.readLine()) !=null){
            System.out.println(i);
        }
        fr.close();
        br.close();
    }
}

//OUTPUT

//<?xml version="1.0" encoding="UTF-8"?>
//<module type="JAVA_MODULE" version="4">
//<component name="NewModuleRootManager" inherit-compiler-output="true">
//<exclude-output />
//<content url="file://$MODULE_DIR$">
//<sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
//</content>
//<orderEntry type="inheritedJdk" />
//<orderEntry type="sourceFolder" forTests="false" />
//</component>
//</module>
