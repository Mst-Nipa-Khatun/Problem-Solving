package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapToSpecificMapConvert3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);

        map2.put(5, "one");
        map2.put(6, "two");
        map2.put(7, "three");
        map2.put(8, "four");
        System.out.println(map2);

        map2.putAll(map);
        System.out.println(map2); //here keys always different but values same no issues

    }
}
