package com.mycompany.problemsolving;

import java.util.ArrayList;

public class RemoveFromArraylistPb4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
