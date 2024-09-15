package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmptyMapCheck5 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);

//        map.clear();
//        System.out.println(map);

        boolean empty = map.isEmpty();
        System.out.println(empty);
    }
}
