package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSetPb12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //System.out.println(list.size());
        System.out.println(list);

        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            set.add(i);
        }
        //System.out.println(set.size());
        System.out.println(set);
    }
}
