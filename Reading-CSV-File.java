package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File myObject = new File("mnist_test.csv");
        Scanner scanner = new Scanner(myObject);
        String line = "";

        while (scanner.hasNext()){
            line = scanner.nextLine();
            System.out.println(line);
            System.out.println();
            //until the two lines.
        }
        List<String> lines = Files.readAllLines(new File("mnist_test.csv").toPath());
        System.out.println(lines);
        scanner.close();
        //Printing the entire file

        //converting the String[] into double[]
        double[][] dataSet = readMatrixFromFile("mnist_test.csv");
        double[] firstLine = dataSet[1];
        System.out.println(firstLine.toString());

    }

    private static double[][] readMatrixFromFile(Object s) {
        return new double[0][];
    }
}
