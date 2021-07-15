package fr.epita.arrayLauncher;

import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysBasic {

    public static void main(String[] args) {
        //1st kind of declaring a class type array and initializing it.
        String[] strArray = new String[3];
        //the size of array is 3 and maximal index is 2

        strArray[0] = "test";
        strArray[1] = "of";
        strArray[2] = "array data structure";
        System.out.println();
        //initializing array only if we know the values

        //printing with the conversion toString format
        System.out.println("strArray with String property: " + Arrays.toString(strArray));
        System.out.println();

        System.out.println("strArray without String property:" + strArray);
        System.out.println();
        //printing the strArray without the property of toString

        //the class type array has a lot of properties. Arrays.toString - .length
        //How to iterate over the arrays?
        //Since we know the size of our array. It's a for loop
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Iteration: " + strArray[i]);
        }
        System.out.println("End of first kind");
        //End of the first and oldest type of initialization.
    }
}