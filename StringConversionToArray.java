//CONVERSION OF STRING CSV TO STRING[]

package FilesExample;

import java.util.Arrays;

public class DataConversion {

    public static void main(String[] args) {

        String rawInput = "'a','3','c,zeaj'";

        String[] myString = rawInput.split("','");

        String first = myString[0];
        System.out.println("firstIndex: " + first);

        String last = myString[myString.length -1];
        System.out.println("lastIndex: " + last);

        myString[0] = first.substring(1);
        myString[myString.length -1] = last.substring(0, last.length() - 2);

        System.out.println(Arrays.toString(myString));

        String s = myString[1];
        System.out.printf("IndexOne: " + s);
    }
}



//OUTPUT
//firstIndex: 'a
//lastIndex: c,zeaj'
//[a, 3, c,zea]
//IndexOne: 3
