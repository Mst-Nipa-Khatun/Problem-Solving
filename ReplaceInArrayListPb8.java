package com.mycompany.problemsolving;

import java.util.ArrayList;

public class ReplaceInArrayListPb8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.set(2,"E");
        System.out.println(list);
    }
}
