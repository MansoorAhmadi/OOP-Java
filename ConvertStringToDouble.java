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
        List<double []> matrixAsList = new ArrayList<>();
        List<String> errors = new ArrayList<>();

        int maxLines = 100;
        int counter = 0;

        while (scanner.hasNext() && counter < maxLines){
            counter++;
            line = scanner.nextLine();

            String[] cells = line.split(",");
            double[] doubleArray = new double[cells.length];

            for(int i=0; i< cells.length; i++){

                try {
                        double cellsAsDouble = Double.parseDouble(cells[i]);
                        doubleArray[i] = cellsAsDouble;
                        matrixAsList.add(doubleArray);
                    }
                    catch (NumberFormatException nfe) {
                        errors.add("error in line" + line);
                        continue;
                    }
            }

            //until the two lines.
        }
        List<String> lines = Files.readAllLines(new File("mnist_test.csv").toPath());
        System.out.println(lines);
        scanner.close();
        //Printing the entire file

    }

    private static double[][] readMatrixFromFile(Object s) {
        return new double[0][];
    }
}
