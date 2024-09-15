package com.mycompany.problemsolving.hashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapToSet9 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.print("Map:");
        System.out.println(map);
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.print("Set:");
        System.out.println(set);

    }
}
