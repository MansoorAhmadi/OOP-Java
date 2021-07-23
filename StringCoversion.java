package fr.epita.conversions;

import java.util.Arrays;

public class StringConversion2 {
    public static void main(String[] args) {

        //String conversion
        //String split
        String rawInput = "'a','3','c,andi'";
        //we have a raw input, we can imagine like a CSV input
        //we have the input of strings

        String[] mySplit = rawInput.split("','");
        //we split the elements "a,b,c" with a delimiter.
        //we are storing the the variable values into an array of strings called mySplit and splitting it.

        String first = mySplit[0];
        String last = mySplit[mySplit.length - 1];
        //since its an array we can access the first and the last indexes
        //the last index for last is variable name = mySplit.length -1.


        //variableName.substring(); function has two methods:
        //1, @range int beginIndex - It takes an integer as a beginning index
        //2, int beginIndex, endIndex - It takes two integers as a beginning and end which is a fixed index.

        mySplit[0] = first.substring(1);
        //mySplit variable is holding the rawInput at line 14
        //first and last variables are holding mySplit from index 0 to length -1
        //we initialize the index of first variable

        mySplit[mySplit.length - 1] = last.substring(0, last.length() - 2);
        //we initialize the mySplit.length -1 with a substring.
        //the substring removes the specified indexes and will display the rest.

        System.out.println();
        String s = mySplit[1];
        //we are storing the index 1 of rawInput in s.
        //convert and parse to long a string.

        long l = Long.parseLong(s);
        //we pass the string variable to the parsing method.
        //we can parse it into a double if the value is a double
        //Double d = Double.parseDouble(s)
        //and print it
        //System.out.println(d);

        System.out.println("We parsed the string index #one to a Long: " + l);
        System.out.println();

        System.out.println(mySplit);
        System.out.println();

        System.out.println(Arrays.toString(mySplit));
        //mySplit is not in a readable format.
        //an array of string which is not directly printable

        for (String words : mySplit) {
            System.out.println("Each Loop: " + words);
        }
    }
}
