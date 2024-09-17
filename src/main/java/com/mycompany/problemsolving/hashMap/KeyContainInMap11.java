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
        hm.put(1,"One extra");
        System.out.println(hm.get(1));
        hm.remove(2);
        System.out.println(hm.get(2));


        System.out.println(hm.keySet());

//        Set<Integer> keys = hm.keySet();
//        System.out.println(keys);
    }
}
