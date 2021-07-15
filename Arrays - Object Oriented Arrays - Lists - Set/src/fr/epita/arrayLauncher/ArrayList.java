package fr.epita.arrayLauncher;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
       List<String> strList = new LinkedList<>();

       strList.add("This is");
       strList.add("a test");

        System.out.println(strList);


        List<String> anotherList = Arrays.asList("This is", "another", "test");
        System.out.println(anotherList);
        //another version of list initialization.


        String[] strArray = new String[]{"a","b","c"};
        //creating a String array - initialized with list of Strings a b c

        List<String> strings = Arrays.asList(strArray);
        //we pass the strArray variable carrying the value
        //to Type 'List' method or function which is Array.asList

        System.out.println(strings);
        //we will see the array as a list

    }

}
