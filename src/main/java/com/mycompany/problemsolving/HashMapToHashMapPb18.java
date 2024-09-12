package com.mycompany.problemsolving;

import java.util.HashMap;

public class HashMapToHashMapPb18 {
    public static void main(String[] args) {
        HashMap<String, Integer> HashMap1 = new HashMap< >();
        HashMap1.put("a", 1);
        HashMap1.put("b", 2);
        HashMap1.put("c", 3);
        System.out.println(HashMap1);

        HashMap<String, Integer> HashMap2 = new HashMap< >();
        for (String key : HashMap1.keySet()) {
            HashMap2.put(key, HashMap1.get(key));

        }
        System.out.println(HashMap2);





    }
}
