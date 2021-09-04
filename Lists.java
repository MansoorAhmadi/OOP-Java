package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListD {
    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();

        firstList.add("This");
        firstList.add("is");
        firstList.add("our first List");

        System.out.println(firstList);

        for (String myString: firstList) {
            System.out.println(myString);
        }
        System.out.println();

        //from array to List
        String[] myString = new String[]{"This", "is", "an Array type"};
        List<String> secondList = Arrays.asList(myString);

        System.out.println(secondList);
    }
}

//OUTPUT
//[This, is, our first List]
//This
//is
//our first List

//[This, is, an Array type]
