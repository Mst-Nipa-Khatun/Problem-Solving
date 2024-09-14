package com.mycompany.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class HashMapPb15 {
    public static void main(String[] args) {
        Map<String, String> foodTable = new HashMap<String, String>();

        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");
       System.out.println(foodTable);
        System.out.println(foodTable.get("A"));
        System.out.println(foodTable.get("J"));
        System.out.println(foodTable.get("P"));
        System.out.println(foodTable.get("H"));


    }
}
