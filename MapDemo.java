//MAP - HashMap<>()
//TO SET - Collection - KEY & VALUE
package List;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        //Key, Value

        myMap.put("CDG", "Charles De Gaulle");
        myMap.put("ORY", "ORLY");
        myMap.put("LAX", "Los Angeles");

        System.out.println(myMap);

        //From Map<String, String> to a Set<String>
        System.out.println("From Map to SET");

        //To set the keys 'CDG, ORY, LAX' we call .keySet() method - Set takes one String
        Set<String> mySet = myMap.keySet();

        //for values 'Charles De Gaulle, Orly, Los Angeles' we call the Collection
        Collection<String> myCollection = myMap.values();

        //For both keys and values - we use Map.entry<>
        Set<Map.Entry<String, String>> myBoth = myMap.entrySet();
        for (Map.Entry<String, String> myLoop : myBoth){
            System.out.println("Keys: " + myLoop.getKey() + "  " + "Values: " + myLoop.getValue());
        }

        System.out.println();
        String paris = myMap.get("CDG");
        System.out.println(paris);

        System.out.println();
        myMap.clear();

        System.out.println(myMap);
    }
}


//{LAX=Los Angeles, CDG=Charles De Gaulle, ORY=ORLY}
//From Map to SET
//Keys: LAX  Values: Los Angeles
//Keys: CDG  Values: Charles De Gaulle
//Keys: ORY  Values: ORLY
//
//Charles De Gaulle
//
//{}
