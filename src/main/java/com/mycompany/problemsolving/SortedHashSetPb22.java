package com.mycompany.problemsolving;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedHashSetPb22 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("geeks");
        set.add("for");
        set.add("nipa");
        set.add("khatun");
        set.add("lila");
        System.out.println(set);

        TreeSet<String> sortedSet=new TreeSet<>(set);
        System.out.println(sortedSet);


    }
}
