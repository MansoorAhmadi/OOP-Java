package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {

        //what is the output?
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.print(list1.equals(list2));
        System.out.print(list1.equals(list3));

        //what is the output?
        String[] myArray = {"abc", "2", "10", "0"};
        List<String> list = Arrays.asList(myArray);
        Collections.sort(list);
        System.out.println(Arrays.toString(myArray));
        //It will print 0 10 2 abc

        //what is the output?
        String message = "Hello world!";
        String anotherMessage = message.substring(6, 12)
                + message.substring(12, 6);
        System.out.println(anotherMessage);
        //It will through an exception because we don't have the 12th index.

        //what is the output?
        int count = 0;
        if (count < 3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello World!");
        //It will print Hello World! three times.
    }
}
