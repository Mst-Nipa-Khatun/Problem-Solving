package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapSizeCount2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);
        System.out.println(map.size());
    }
}
