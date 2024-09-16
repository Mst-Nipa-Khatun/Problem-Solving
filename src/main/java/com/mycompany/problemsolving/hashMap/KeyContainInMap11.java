package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Set;

public class KeyContainInMap11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");
        System.out.println(hm);

        System.out.println(hm.keySet());

//        Set<Integer> keys = hm.keySet();
//        System.out.println(keys);
    }
}
