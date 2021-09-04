//SET
//TO LIST AND ARRAY

package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("This");
        mySet.add("is");
        mySet.add("a HashSet");
        mySet.add("a HashSet");

        System.out.println(mySet.size());
        System.out.println(mySet);

        for (String myLoop : mySet){
            System.out.println(myLoop);
        }

        //From Set of Strings to List of Strings in order to allow duplicates
        List<String> myList = new ArrayList<>(mySet);

        //From the Set of String to an Array of String
        String[] setToArray = mySet.toArray(new String[0]);
    }
}


//OUTPUT
//3
//[This, is, a HashSet]
//This
//is
//a HashSet
