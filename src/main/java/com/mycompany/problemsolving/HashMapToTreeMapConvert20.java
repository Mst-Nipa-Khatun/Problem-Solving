package com.mycompany.problemsolving;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreeMapConvert20 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "geeks");
        hashMap.put(2, "forgeeks");
        hashMap.put(3, "computer portal");
        System.out.println("HashMap: " + hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap: " + treeMap);
    }
    }

