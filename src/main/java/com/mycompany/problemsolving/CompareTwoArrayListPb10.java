package com.mycompany.problemsolving;

import java.util.ArrayList;

public class CompareTwoArrayListPb10 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);

        a2.add(9);
        a2.add(2);
        a2.add(3);
        a2.add(7);
        a2.add(5);
        System.out.println(a2);

        boolean test=a.equals(a2);
        System.out.println(test);
    }
}
