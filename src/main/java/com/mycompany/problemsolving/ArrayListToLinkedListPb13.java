package com.mycompany.problemsolving;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedListPb13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>();
        for(Integer i : list)
        {
            list1.add(i.toString());
        }
        System.out.println(list1);


    }
}
