package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveFromMap4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
