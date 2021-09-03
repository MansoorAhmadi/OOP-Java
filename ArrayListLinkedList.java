//ArrayList
//LinkedList
//HashMap


package DataStructures;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Arrays {
    public static void main(String[] args) {

        String[] myArray = new String[3];
        myArray[0] = "test";
        myArray[1] = "of";
        myArray[2] = "Data Structures";

        for (int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        System.out.println(" ");

        for (String myString: myArray) {
            System.out.println("For EACH: " + myString);
        }

        System.out.println("");
        System.out.println("ArrayList Starts HERE");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Opel");
        cars.remove(2);


        System.out.println(cars);
        System.out.println();

        for (int i=0; i<cars.size(); i++){
            System.out.println("LOOP: " + cars.get(i));
        }


        System.out.println();
        System.out.println("ArrayList of INTEGERS");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(8);
        myNumbers.add(12);

        System.out.println();

        Collections.sort(myNumbers);
        for (int i=0; i<myNumbers.size(); i++){
            System.out.println("ArrayList Sorted INTEGER: " + myNumbers.get(i));
        }


        System.out.println();
        System.out.println("HASHMAP HERE");
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println();
        System.out.println();

        System.out.println(capitalCities.get("England"));

        capitalCities.remove("USA");
        System.out.println(capitalCities);


        for (String myCities : capitalCities.keySet()) {
            System.out.println("for EACH Loop KEY: " + myCities);
        }
        System.out.println();

        for (String myCities : capitalCities.values()) {
            System.out.println("for EACH Loop VALUE: " + myCities);
        }
    }
}

//OUTPUT

//    test
//    of
//    Data Structures
//
//    For EACH: test
//    For EACH: of
//    For EACH: Data Structures
//
//    ArrayList Starts HERE
//    [Opel, BMW, Mazda]
//
//    LOOP: Opel
//    LOOP: BMW
//    LOOP: Mazda
//
//    ArrayList of INTEGERS
//
//    ArrayList Sorted INTEGER: 8
//    ArrayList Sorted INTEGER: 10
//    ArrayList Sorted INTEGER: 12
//    ArrayList Sorted INTEGER: 15
//    ArrayList Sorted INTEGER: 20
//    ArrayList Sorted INTEGER: 25
//
//        HASHMAP HERE
//        {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
//
//
//        London
//        {Norway=Oslo, England=London, Germany=Berlin}
//        for EACH Loop KEY: Norway
//        for EACH Loop KEY: England
//        for EACH Loop KEY: Germany
//
//        for EACH Loop VALUE: Oslo
//        for EACH Loop VALUE: London
//        for EACH Loop VALUE: Berlin
