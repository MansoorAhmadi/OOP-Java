package fr.epita.arrayLauncher;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        //the base implementation of the Set is the hashSet();

        //if we want to add something
        stringSet.add("this is");
        stringSet.add("a test");
        stringSet.add("a test");

        System.out.println(stringSet);

        //smart way to avoid the duplicated, to have unique values.
        //it will filter duplicates automatically
    }
}
