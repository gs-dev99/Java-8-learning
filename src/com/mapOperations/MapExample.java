package com.mapOperations;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Creating a Map (Key: String, Value: Integer)
        Map<String, Integer> studentsMarks = new HashMap<>();

        // Adding values to the Map
        studentsMarks.put("Jyoti", 35);
        studentsMarks.put("Gaurav", 95);
        studentsMarks.put("Alice", 55);
        studentsMarks.put("Kavi", 20);

        System.out.println(studentsMarks);

        // Retrieving a value
        System.out.println("Alice marks" + studentsMarks.get("Alice"));


        // Iterating over keys and values
        System.out.println("\n");
        for(Map.Entry<String, Integer> entry :studentsMarks.entrySet()){
            System.out.println(entry.getKey() + " scored  : "+entry.getValue());
        }

        // Iterate Over Keys Only
        System.out.println("\n");
        for(String key : studentsMarks.keySet()){
            System.out.println("Keys : "+key);
        }

        // values() – Iterate Over Values Only
        System.out.println("\n");
        for(Integer value : studentsMarks.values()){
            System.out.println("Value : "+value);
        }




    }
}
