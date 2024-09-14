package com.mycompany.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class KeyIndexCheckPb16 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();
        names.put(1, "Doe");
        names.put(2, "John");
        names.put(3, "Jane");
        names.put(4, "Jack");

        boolean found = names.containsKey(2);
        System.out.println(found);


        int key = 10;
        boolean isFound = false;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "kibria");
        map.put(2, "nipa");

        for (Integer mapKey : map.keySet()) {
            if (mapKey == key) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);


    }
}
