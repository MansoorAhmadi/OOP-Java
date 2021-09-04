//ARRAYS

package List;

import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        String[] firstArray = new String[3];

        firstArray[0] = "This";
        firstArray[1] = "is";
        firstArray[2] = "our first Array";

        System.out.println(java.util.Arrays.toString(firstArray));

        String[] secondArray = new String[]{"This", "is", "our second Array"};
        System.out.println(java.util.Arrays.toString(secondArray));

        for (String myLoop : firstArray) {
            System.out.println("First Array LOOP: " + myLoop);
        }
    }
}


//OUTPUT
//[This, is, our first Array]
//[This, is, our second Array]
//First Array LOOP: This
//First Array LOOP: is
//First Array LOOP: our first Array
