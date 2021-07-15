package fr.epita.arrayLauncher;

import java.util.Arrays;
import java.util.List;

public class ArrayBasic2 {
    public static void main(String[] args) {

        //2nd kind of declaring a class type array and initializing it. Array List
        String[] anotherArray = new String[]{"test", "of", "another array"};
            System.out.println();
            System.out.println(anotherArray);
            System.out.println(Arrays.toString(anotherArray));
            System.out.println();
        //without .toString property. It shows the unreadable format

        //Iterating over the array list.
        for (int i=0; i<anotherArray.length; i++){
            System.out.println("Iteration: " + anotherArray);
            //iteration of anotherArray without toString property anotherArray
            //if we iterate over the indexes anotherArray[i] with "i" it will print it correctly
            //sout("Iteration" + anotherArray[i]);
        }
            System.out.println();

        for (int i=0; i<anotherArray.length; i++){
            System.out.println(Arrays.toString(anotherArray));
        }

    }
}


