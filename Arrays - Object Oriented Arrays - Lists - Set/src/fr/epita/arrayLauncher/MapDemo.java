package fr.epita.arrayLauncher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> airports = new HashMap<>();
        //we encode and associate to a category
        //It uses the hash to give the insertion order.
        //it will depend on the insertion behaviour.
        //to keep the insertion method, there is another method.
        // LinkedHashMap. We preserve the insertion order same as insertion.

        airports.put("CDG","Charles De Gaulle");
        airports.put("ORY","Orly");
        airports.put("Lax","Los Angeles");
        //this is how we initialize it

        System.out.println(airports);
        //the output until here: {Lax=Los Angeles, CDG=Charles De Gaulle, ORY=Orly}


        //Loop definition starts here

        Set<String> stringSet = airports.keySet();
        //keySet() function is in Set type definition
        //we use Set for the airport variable to avoid duplicated in keys

        Collection<String> valuesSet = airports.values();
        //values() function is in Collection type definition
        //we use Collection for the airport variable

        Set<Map.Entry<String, String>> mapEntries = airports.entrySet();
        //to iterate on both keys and values. We use Map.Entry for two Strings
        //the 1st string is the key, the second string is the value.
        //we use entry.Set(); to set entries without duplicated for the keys and values for the airport variable
        //and store it in mapEntries.

        for (Map.Entry<String, String> entry : mapEntries){
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        String setLabel = airports.get("CDG");
        System.out.println(setLabel);
        //we are storing the CDG value in set Label and printing it.
        //which is Charles De Gaulle
    }
}

